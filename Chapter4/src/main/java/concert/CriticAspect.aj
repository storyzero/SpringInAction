package concert;

import com.springinaction.springidol.CriticismEngine;

/**
 * Created by seed on 2016. 6. 2..
 */
public aspect CriticAspect {

    pointcut performance() : execution(* perform(..));

    after() : returning() : perfermance() {
        System.out.println(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}

package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by seed on 2016. 6. 2..
 */

@Aspect
@Component
public class EncoreableIntroducer {

    @DeclareParents(value="concert.Performance+",
            defaultImpl=DefaultEncoreable.class)
    public static Encoreable encoreable;
}

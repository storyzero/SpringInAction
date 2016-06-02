package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by seed on 2016. 6. 2..
 */

@Aspect
@Component
public class AroundAuidence {

    @Pointcut("execution(** concert.Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("[Around]]Silencing cell phones");
            System.out.println("[Around]Taking seats");
            jp.proceed();
            System.out.println("[Around]CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            System.out.println("[Around]Demanding a refund");
        }
    }
}

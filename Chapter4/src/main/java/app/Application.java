package app;

import concert.ConcertConfig;
import concert.Performance;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by seed on 2016. 6. 1..
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConcertConfig.class);

        Performance performance = (Performance) context.getBean("performance");
        performance.perform();
        performance.perform("seed", "sim");
    }
}

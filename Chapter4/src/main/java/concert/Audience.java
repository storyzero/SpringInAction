package concert;


import org.aspectj.lang.annotation.*;

/**
 * Created by seed on 2016. 6. 1..
 */

@Aspect
public class Audience {

    // 공인 이전
    @Before("execution(** concert.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    // 공연 이전/*
    @Before("execution(** concert.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    // 공연 후
    @AfterReturning("execution(** concert.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    // 공연 실패 후
    @AfterThrowing("execution(** concert.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    @Before("execution(** concert.Performance.perform(String, String)) && args(name, ext)")
    public void Riddikulus(String name, String ext) {
        System.out.println(name + ".fool");
        System.out.println("stupid." + ext);
    }
}

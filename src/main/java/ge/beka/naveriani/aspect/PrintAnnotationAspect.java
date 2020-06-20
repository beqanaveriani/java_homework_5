package ge.beka.naveriani.aspect;

import ge.beka.naveriani.models.Println;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class PrintAnnotationAspect {

    @Before(value = "@annotation(println)")
    public void beforeCalculation(JoinPoint joinPoint, Println println){
        Object[] args = joinPoint.getArgs();
        int x = (int) args[0];
        int y = (int) args[1];
        log.info((String.format("Arguments x: %s, y : %s", x, y)));
    }

}

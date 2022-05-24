package com.lq.lidar.common.aspectj;

import com.lq.lidar.common.annotation.TaskTime;
import com.lq.lidar.common.utils.ServletUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TaskTimeAspect {
    private static final Logger log = LoggerFactory.getLogger(TaskTimeAspect.class);

    StopWatch stopWatch = new StopWatch();

    @Before("@annotation(controllerTaskTime)")
    public void doBefore(JoinPoint joinPoint, TaskTime controllerTaskTime) throws Throwable {
//        startTime.set(System.currentTimeMillis());
        stopWatch.start();
        //接收到请求，记录请求内容
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
        //记录请求的内容
//        log.info("请求URL:" + request.getRequestURL().toString());
//        log.info("请求METHOD:" + request.getMethod());
    }


    /**
     * 处理完请求后执行
     *
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut = "@annotation(controllerTaskTime)", returning = "jsonResult")
    public void doAfterReturning(JoinPoint joinPoint, TaskTime controllerTaskTime, Object jsonResult) {
//        handleLog(joinPoint, controllerLog, null, jsonResult);
        stopWatch.stop();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        StringBuilder message = new StringBuilder();
        message.append(stopWatch.getTotalTimeMillis() / 1000.0);
        message.append(" seconds");
        log.info("请求URL:{}", ServletUtils.getRequest().getRequestURI());
        log.info("请求METHOD:{}", ServletUtils.getRequest().getMethod());
        log.info("请求CLASSNAME:{}", className);
        log.info("请求METHODNAME:{}", methodName);
        log.info("方法执行耗时:{}", message);
    }

}

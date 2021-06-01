package br.com.tony.marvelapi.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopLogger {

    @Around("@annotation(Loggable)")
    public Object logInfo(ProceedingJoinPoint joinPoint) throws Throwable {
        Logger logger = LoggerFactory
                .getLogger(joinPoint.getTarget().getClass().getCanonicalName());

        try {
            logger.info("Iniciando execução do método método [{}] na classe [{}] com o parâmetro {}",
                    joinPoint.getSignature().getName(),
                    joinPoint.getSignature().getDeclaringType().getSimpleName(),
                    joinPoint.getArgs());

            Object proceed = joinPoint.proceed();

            logger.info("Execução finalizada com sucesso!");
            return proceed;

        } catch (Throwable e) {
            logger.info("Execução retornando uma exception do tipo {} com a mensagem: {}",
                    e.getClass().getSimpleName(),
                    e.getMessage());
            throw e;
        }
    }
}

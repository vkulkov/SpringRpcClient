package com.simple.service;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculationServiceClient {
    private static Logger logger = Logger.getLogger(CalculationServiceClient.class);

    public static void main(String[] args) {
        logger.debug("Calculation Service Client is starting...");

        ApplicationContext context = new ClassPathXmlApplicationContext("client-rpc-config.xml");

        CalculationService calculationService = (CalculationService) context.getBean("hessianCalculationService");

        int x = 100, y = 10;

        System.out.printf("Addition: %d + %d = %d%n", x, y, calculationService.add(x, y));
        System.out.printf("Subtraction: %d - %d = %d%n", x, y, calculationService.subtract(x, y));
        System.out.printf("Multiplication: %d * %d = %d%n", x, y, calculationService.multiply(x, y));
        System.out.printf("Division: %d / %d = %f%n", x, y, calculationService.divide(x, y));

        logger.debug("Calculation Service Client is stopped.");
    }
}

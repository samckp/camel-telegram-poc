package com.sam.camel.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Bot {

    private Logger log = LoggerFactory.getLogger(getClass());

    public String process(String message) {

        if (message == null) {
            return null;
        }

        log.info("Received message: {}", message);

        return generateTable(message);
    }

    private String generateTable(String message){

        StringBuilder str = new StringBuilder();
        int num = Integer.parseInt(message);
        for(int i=1;i<=10;i++){
            str.append(i * num);
            str.append("\n");
        }
        return "Table of given number : "+ num + " is \n" + str;
    }
}

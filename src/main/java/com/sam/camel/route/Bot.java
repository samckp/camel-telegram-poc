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
        return "Jo Hukum mere Aaka....What can I do for you \"" + message.replace("\"", "-") + "\"?";
    }
}

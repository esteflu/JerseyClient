package com.lundberg.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

@RestController
public class Controller {

    @RequestMapping(value = "/stuff", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
    public String getStuff(@RequestBody String stuff) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return stuff;
    }
}

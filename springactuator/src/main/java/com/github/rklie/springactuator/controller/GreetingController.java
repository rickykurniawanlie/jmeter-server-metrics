package com.github.rklie.springactuator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class GreetingController {

  @GetMapping(value = "/greeting")
  @ResponseBody
  public String getGreeting(long delay) throws InterruptedException {
    Thread.sleep(delay);
    return "Hello world with delay " + delay;
  }

}
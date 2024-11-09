package com.test.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class QuestionController {
    @GetMapping("allMessages")
    public String getAllQuestions(){
        return "Hi, This is the message";
    }
}

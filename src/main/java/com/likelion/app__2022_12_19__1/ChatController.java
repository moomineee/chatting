package com.likelion.app__2022_12_19__1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/chat")
public class ChatController {
    @PostMapping("/writeMessage")
    @ResponseBody
    public String writemessage() {
        return "메세지가 작성되었습니다.";
    }
}

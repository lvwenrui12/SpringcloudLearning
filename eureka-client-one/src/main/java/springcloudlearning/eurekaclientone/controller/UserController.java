package springcloudlearning.eurekaclientone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("user")
    public String getUser() {
        return "I am the most handsome";
    }

}

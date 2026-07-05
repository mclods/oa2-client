package com.mclods.oa2_client.controllers;

import com.mclods.oa2_client.dtos.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hi")
    public String hi() {
        return "Hi there!";
    }

    @GetMapping("/user")
    public ResponseEntity<UserDto> getUser(@AuthenticationPrincipal OAuth2User principal) {
        return ResponseEntity.ok(new UserDto(
                principal.getAttribute("name"),
                principal.getAttribute("email"),
                principal.getAttribute("picture")
        ));
    }
}

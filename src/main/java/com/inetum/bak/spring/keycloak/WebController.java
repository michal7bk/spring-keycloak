package com.inetum.bak.spring.keycloak;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class WebController {


    @GetMapping(path = "/currentUser")
    public ResponseEntity currentUser(Principal principal) {
        return ResponseEntity.ok(principal);
    }
}

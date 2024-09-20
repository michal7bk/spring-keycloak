package com.inetum.bak.spring.keycloak;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

import static java.lang.String.format;

@Controller
public class WebController {

    @GetMapping(path = "/currentUser")
    public ResponseEntity currentUser(Principal principal) {
        return ResponseEntity.ok(format("Hello authenticated user %s from authorized resource", principal.getName()));
    }

    @GetMapping(path = "/public")
    public ResponseEntity notAuthorizedResource(Principal principal) {
        return ResponseEntity.ok(format("Hello authenticated user %s from NOT authorized resource", principal.getName()));
    }
}

package io.asora.logs.controller;

import io.asora.logs.domain.SignUp;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/signUp")
public class SignUpController {

    private List<SignUp> signUpList = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET)
    public List<SignUp> findAll() {
        return signUpList;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(@RequestBody SignUp signUp) {
        signUpList.add(signUp);

        return "You have successfully signed up!";
    }
}

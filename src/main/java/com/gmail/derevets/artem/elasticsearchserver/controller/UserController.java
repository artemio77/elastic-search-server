package com.gmail.derevets.artem.elasticsearchserver.controller;

import com.gmail.derevets.artem.elasticsearchserver.elastic.UserElasticRepository;
import com.gmail.derevets.artem.elasticsearchserver.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/userManagement/elastic/")
public class UserController {

    @Autowired
    private UserElasticRepository userElasticRepository;

    @GetMapping("/get/{email:.+}")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    User getUserByEmail(@PathVariable("email") String email) {
        User user = userElasticRepository.findByEmail(email);
        log.info("GET User {}", user);
        return user;
    }




}

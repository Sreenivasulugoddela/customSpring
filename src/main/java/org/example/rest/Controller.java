package org.example.rest;

import org.example.model.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Controller {


    @GetMapping(value = "/userData")
    public Object getUserDetails(){
        UserDetails userDetails = new UserDetails();

        userDetails.setUserEmail("user@gmail.com");
        userDetails.setUserPassword("passwd");
        userDetails.setUserFirstName("user_firstName");
        userDetails.setUserLastName("user_lastName");
        userDetails.setId(1L);
        return userDetails;
    }
}

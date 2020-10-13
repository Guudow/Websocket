package com.example.Websocket.resource;

import com.example.Websocket.model.User;
import com.example.Websocket.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping
    @SendTo("/Topic/user")
    public UserResponse getUser(User user) {
        return new UserResponse("Hi " + user.getName());

    }
}

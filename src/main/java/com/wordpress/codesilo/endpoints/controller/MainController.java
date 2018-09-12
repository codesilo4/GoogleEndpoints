package com.wordpress.codesilo.endpoints.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordpress.codesilo.endpoints.model.MainMessage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/root")
@Api(tags={"Root Controller"}, value="Open API for testing", consumes="null")
public class MainController {
 
    @ApiOperation(value = "Returns a message", response = MainMessage.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Greeting is successfully sent"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
            }
    )
    @RequestMapping(value="/",method = RequestMethod.GET)
    public MainMessage getMessage(){
        return new MainMessage("This is the root controller !!");
    }
}
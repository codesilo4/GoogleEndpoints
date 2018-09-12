package com.wordpress.codesilo.endpoints.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="Main Response", description="Sample model")
public class MainMessage {
 
    @ApiModelProperty(value = "Greeting/Message", required=true)
    private String greeting;
 
    public MainMessage(){
    }
 
    public MainMessage(String greeting){
        this.greeting = greeting;
    }
    public String getGreeting() {
        return greeting;
    }
 
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
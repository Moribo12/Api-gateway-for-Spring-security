package com.geeks4learning.api_gateway.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/goalManagementServiceFallBack")
    public String goalManagementServiceFallBack(){
        return "The Goal-Management-Service is currently down!";
    }

    @GetMapping("/leaveServiceFallBack")
    public String leaveServiceFallBack(){
        return "The Leave-Service is currently down!";
    }

    @GetMapping("/attendanceServiceFallBack")
    public String attendanceServiceFallBack(){
        return "The Attendance-Service is currently down!";
    }

    @GetMapping("/scheduleServiceFallBack")
    public String scheduleServiceFallBack(){
        return "The Schedule-Service is currently down!";
    }

    @GetMapping("/userManagementServiceFallBack")
    public String userManagementServiceFallBack(){
        return "The User-Management-Service is currently down!";
    }
    @GetMapping("/authenticationServiceFallBack")
    public String authenticationServiceFallBack(){
        return "The Authentication-Service is currently down!";
    }

}

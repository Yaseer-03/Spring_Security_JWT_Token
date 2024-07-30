package com.example.demo.Controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String getUserDashboard() {
        return "User Dashboard";
    }

    @PreAuthorize(("hasRole('ADMIN')"))
            @GetMapping("/admin")
            public String getAdminDashBoard(){
        return "Hello Admin..!";
    }
}

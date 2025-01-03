package com.example.Email_Verification.controller;

import com.example.Email_Verification.service.EmailService;
import com.example.Email_Verification.service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OtpController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private OtpService otpService;

    @PostMapping("/send-otp")
    public String sendOtp(@RequestParam String email) {
        String otp = otpService.generateOtp(); // OTP generate karna
        emailService.sendOtp(email, otp); // OTP ko email pe bhejna
        return "OTP sent successfully to " + email;
    }

}



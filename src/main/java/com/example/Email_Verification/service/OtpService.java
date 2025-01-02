package com.example.Email_Verification.service;

import com.example.Email_Verification.entity.User;
import com.example.Email_Verification.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
public class OtpService {

    @Autowired
    UserRepository userRepository;


    public String generateOtp() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000); // 6 digit OTP generate karega
        return String.valueOf(otp);
    }



}

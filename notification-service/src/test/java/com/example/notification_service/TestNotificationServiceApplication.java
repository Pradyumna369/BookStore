package com.example.notification_service;

import com.example.notification_service.NotificationServiceApplication;
import org.springframework.boot.SpringApplication;
import org.testcontainers.utility.TestcontainersConfiguration;

public class TestNotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication
                .from(NotificationServiceApplication::main)
                .with(TestcontainersConfiguration.class)
                .run(args);
    }
}

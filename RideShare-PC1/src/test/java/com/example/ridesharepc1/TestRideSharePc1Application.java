package com.example.ridesharepc1;

import org.springframework.boot.SpringApplication;

public class TestRideSharePc1Application {

    public static void main(String[] args) {
        SpringApplication.from(RideSharePc1Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}

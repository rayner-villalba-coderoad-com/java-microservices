package com.rayner.app.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}

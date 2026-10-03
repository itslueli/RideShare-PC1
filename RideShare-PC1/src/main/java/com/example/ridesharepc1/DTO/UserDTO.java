package com.example.ridesharepc1.DTO;

public class UserDTO {

    private Long id;
    private String username;

    @Email(message = "El formato del email es incorrecto")
    @NotBlank(message = "El email del usuario es obligatorio")
    private String email;
    @NotNull(message="Contraseña incorrecta")
    @SizeMin = 8
    @SizeMAx = 20
    private String password;


    private String rol(ROLE_PASSENGER, ROLE_DRIVER, ROLE_ADMIN) {
        return null;
    }

}

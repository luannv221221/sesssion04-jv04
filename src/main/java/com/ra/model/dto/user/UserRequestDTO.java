package com.ra.model.dto.user;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequestDTO {
    @NotBlank
    private String fullName;
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    private String address;
}

package com.cruiser.secureDemo.dto.request;

import com.cruiser.secureDemo.Common.enums.Roles;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserCreationRequestDto {

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private Roles role;
}

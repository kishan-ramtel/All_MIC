package com.latest.allmic.dtos.user;

import com.latest.allmic.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @NotBlank
    private UUID id;

    @NotNull
    private String email;

    @NotNull
    private String name;

    @NotNull
    private Integer age;

    @NotBlank
    private UserRole role;

    @NotNull
    private Boolean isActive;

    private String bio;

    private String profileImageUrl;

}

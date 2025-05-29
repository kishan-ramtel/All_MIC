package com.latest.allmic.entity.user;

import com.latest.allmic.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name ="users", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    private Integer age;

    @Column(nullable = false)
    private String password;

    private UserRole role = UserRole.USER;

    private boolean isActive = true;

    private String profileImageUrl;

    @Column(length = 500)
    private String bio;

    @Column(updatable = false)
    private LocalDateTime  createdAt;

    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
    }
}

package com.deva.employeemanager.authenticate.registration.token;

import com.deva.employeemanager.authenticate.appUser.AppUser;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ConfirmationToken {
    @SequenceGenerator(
            name = "confirmation_token_sequence",
            sequenceName = "confirmation_token_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "confirmation_token_sequence"
    )
    private Long id;
    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private LocalDateTime expiresAt;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "app_user_id"
    )
    private AppUser appUser;

    private LocalDateTime confirmedAt;

    public ConfirmationToken(String token, LocalDateTime expiresAt, LocalDateTime createdAt, LocalDateTime confirmedAt, AppUser appUser) {
        this.token = token;
        this.expiresAt = expiresAt;
        this.createdAt = createdAt;
        this.confirmedAt = confirmedAt;
        this.appUser = appUser;
    }

    public ConfirmationToken(String token, LocalDateTime expiresAt, LocalDateTime createdAt, AppUser appUser) {
        this.token = token;
        this.expiresAt = expiresAt;
        this.createdAt = createdAt;

        this.appUser = appUser;
    }
}

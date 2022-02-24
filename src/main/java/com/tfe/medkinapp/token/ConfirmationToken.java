package com.tfe.medkinapp.token;



import com.tfe.medkinapp.model.appuser.AppUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="token")
public class ConfirmationToken {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private String token;
    @Column(nullable=false)
    private LocalDateTime createAt;
    @Column(nullable=false)
    private LocalDateTime expiresAt;
    @Column(nullable=false)
    private LocalDateTime confirmedAt;
    @ManyToOne
    @JoinColumn(
            nullable = false,
            name="app_user_id"
    )
    private AppUser appUser;


    public ConfirmationToken(String token, LocalDateTime createAt, LocalDateTime expiresAt, AppUser appUser) {
        this.token = token;
        this.createAt = createAt;
        this.expiresAt = expiresAt;
        this.appUser = appUser;
    }
}

package com.tfe.medkinapp.request;

import com.tfe.medkinapp.model.appuser.AppUserRole;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String nom;
    private final String prenom;
    private final String email;
    private final String password;
    private final AppUserRole appUserRole;
    private final Boolean locked;
    private final Boolean enabled;
}

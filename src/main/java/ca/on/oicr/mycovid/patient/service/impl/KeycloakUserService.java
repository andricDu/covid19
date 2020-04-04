package ca.on.oicr.mycovid.patient.service.impl;

import ca.on.oicr.mycovid.patient.service.UserService;
import org.keycloak.admin.client.Keycloak;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("keycloak")
@Component
public class KeycloakUserService implements UserService {

  private final Keycloak keycloak;

  public KeycloakUserService(Keycloak keycloak) {
    this.keycloak = keycloak;
  }

  @Override
  public String addUser(String email) {
    return "";
  }

  @Override
  public String addUserWithNotification(String email) {
    return "";
  }
}

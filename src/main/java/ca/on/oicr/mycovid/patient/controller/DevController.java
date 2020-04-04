package ca.on.oicr.mycovid.patient.controller;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.keycloak.admin.client.CreatedResponseUtil;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.common.util.RandomString;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Profile("dev")
@Controller
@RequestMapping("/dev")
public class DevController {

  private final Keycloak keycloak;

  public DevController(Keycloak keycloak) {
    this.keycloak = keycloak;
  }

  @PostMapping(path = "/users")
  public ResponseEntity<String> addUser() {
    log.info("foobar");

    val user = new UserRepresentation();
    val email = RandomString.randomCode(5) + "@example.org";
    user.setEmail(email);
    user.setUsername(email);
    user.setEnabled(true);

    val usersResource = keycloak.realm("covid").users();

    val response = usersResource.create(user);
    val userId = CreatedResponseUtil.getCreatedId(response);

    val userResource = usersResource.get(userId);
    try {
      userResource.sendVerifyEmail("covid19-service");
    } catch (Exception e) {
      throw e;
    }

    return ResponseEntity.ok("Created");
  }
}

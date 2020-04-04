package ca.on.oicr.mycovid.patient.service.impl;

import ca.on.oicr.mycovid.patient.service.UserService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("ego")
@Component
public class EgoUserService implements UserService {

  public EgoUserService() {}

  @Override
  public String addUser(String email) {
    throw new UnsupportedOperationException("Not Implemented");
  }

  @Override
  public String addUserWithNotification(String email) {
    throw new UnsupportedOperationException("Not Implemented");
  }
}

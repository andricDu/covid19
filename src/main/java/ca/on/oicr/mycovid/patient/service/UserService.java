package ca.on.oicr.mycovid.patient.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

  /**
   * Add a new user to the backing auth/account system
   *
   * @param email Email of user to add, should be assumed to be the username where possible
   * @return The ID of the newly created user;
   */
  public String addUser(String email);

  /**
   * Add anew user to the backing auth/account system while also sending out a user notification or
   * event that has domain relevance to that auth/account system.
   *
   * @param email Email of the user to add, should be assumed to be the username where possible
   * @return
   */
  public String addUserWithNotification(String email);
}

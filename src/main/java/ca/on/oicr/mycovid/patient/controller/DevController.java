package ca.on.oicr.mycovid.patient.controller;

import lombok.extern.slf4j.Slf4j;
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

  @PostMapping(path="/users")
  public ResponseEntity<String> addUser() {
    log.info("foobar");
    return ResponseEntity.ok("Created");
  }

}

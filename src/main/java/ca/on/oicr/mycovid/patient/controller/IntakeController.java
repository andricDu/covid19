package ca.on.oicr.mycovid.patient.controller;

import ca.on.oicr.mycovid.patient.model.dto.IntakeForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/intake")
public class IntakeController {

  @GetMapping
  public String intakeForm(Model model) {
    model.addAttribute("intakeForm", new IntakeForm());
    return "intakeForm";
  }
}

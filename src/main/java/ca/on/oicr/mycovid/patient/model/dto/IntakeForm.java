package ca.on.oicr.mycovid.patient.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IntakeForm {

  String postalCode;

  String biologicalSex;

  String severity;

  boolean tested;

  String email;
}

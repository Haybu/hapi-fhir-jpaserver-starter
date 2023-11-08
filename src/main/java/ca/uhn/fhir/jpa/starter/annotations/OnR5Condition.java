package ca.uhn.fhir.jpa.starter.annotations;

import ca.uhn.fhir.context.FhirVersionEnum;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnR5Condition implements Condition {
  @Override
  public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
	  String version = conditionContext.getEnvironment().getProperty("hapi.fhir.fhir_version");
	  return version != null && FhirVersionEnum.forVersionString(version.toUpperCase()) == FhirVersionEnum.R5;

  }
}

package ru.innopolis.stc.spring.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.innopolis.stc.spring.app.controllers.MyController;
import ru.innopolis.stc.spring.app.services.StudentsService;

@Configuration
public class ControllersConfig {

  @Bean
  public MyController blaBlaController(StudentsService studentsService) {
    return new MyController(studentsService);
  }
}

package ru.innopolis.stc.spring.app.controllers;

import java.util.List;
import ru.innopolis.stc.spring.app.services.StudentsService;

public class MyController {

  private final StudentsService service;

  public MyController(StudentsService service) {
    this.service = service;
  }

  public List<String> getStudents() {
    return service.getAllStudents();
  }

}

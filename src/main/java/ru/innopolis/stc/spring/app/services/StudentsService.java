package ru.innopolis.stc.spring.app.services;

import static java.util.Arrays.asList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {

  private MessageService messageService;

  public StudentsService(MessageService messageService) {
    this.messageService = messageService;
  }

  public MessageService getMessageService() {
    return messageService;
  }

  public List<String> getAllStudents() {
    messageService.send("Запрос на список студентов");
    return asList("Вова", "Петя", "Сережа");
  }

}

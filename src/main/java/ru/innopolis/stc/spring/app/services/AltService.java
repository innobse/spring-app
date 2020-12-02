package ru.innopolis.stc.spring.app.services;

import org.springframework.stereotype.Service;

@Service
public class AltService {

  private final MessageService messageService;

  public AltService(MessageService messageService) {
    this.messageService = messageService;
  }

  public void printMsg() {
    messageService.send("Вызвана запись в консоль");
  }

}

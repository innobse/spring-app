package ru.innopolis.stc.spring.app.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ConsoleMessageService implements MessageService {

  public void send(String msg) {
    System.out.println(hashCode() + ": " + msg);
  }

  @PostConstruct
  public void init() {
    System.out.println("Инициализация бина ConsoleMessageService");
  }

  @PreDestroy
  public void destroy() {
    System.out.println("Действие перед удалением бина");
  }
}

package ru.innopolis.stc.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.innopolis.stc.spring.app.config.ControllersConfig;
import ru.innopolis.stc.spring.app.config.ServiceConfig;
import ru.innopolis.stc.spring.app.controllers.MyController;
import ru.innopolis.stc.spring.app.services.AltService;

@Configuration
@Import({ServiceConfig.class, ControllersConfig.class})
public class Application {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);

    final MyController controller = applicationContext.getBean(MyController.class);
    controller.getStudents();

    final AltService altService = applicationContext.getBean(AltService.class);
    altService.printMsg();
  }

}

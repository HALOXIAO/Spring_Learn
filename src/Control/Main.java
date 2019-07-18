package Control;

import DD.config;
import Module.Persion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Persion temp = context.getBean("HALOXIAO", Persion.class);
        temp.use();
    }

}

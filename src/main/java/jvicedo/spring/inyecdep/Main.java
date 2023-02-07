package jvicedo.spring.inyecdep;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("app-context.xml");
            Disco disco = (Disco) factory.getBean("disco");
        System.out.println("-"+disco.getTitulo());
        System.out.println("-"+disco.getAutor().getNombre());
        System.out.println("-"+disco.getDiscográfica());
        System.out.println("-"+disco.getPrecio());
     }
}

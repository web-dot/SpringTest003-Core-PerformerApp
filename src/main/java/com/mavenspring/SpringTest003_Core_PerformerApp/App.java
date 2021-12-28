package com.mavenspring.SpringTest003_Core_PerformerApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Performer p1 = factory.getBean(Juggler.class);
        p1.perform();
        Performer p2 = factory.getBean(Juggler.class);
        p2.perform();
        //System.out.println(p1==p2);//true->beans are instantiated as Singletons
    }
}

package ru.rs.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 23.10.2014.
 */
public class Prog {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Context-dao.xml");

//        DDBServer server=(DDBServer)context.getBean("database");
//        EmbeddedDatabaseBuilder builder=new EmbeddedDatabaseBuilder();
//
//        EmbeddedDatabase db=builder.setType(EmbeddedDatabaseType.DERBY).setName("RSDB").build();


    }
}

package ru.rs.dao;

import org.junit.Test;
import ru.rs.dao.daos.ContactDao;
import ru.rs.dao.daos.ContactDaoImpl;
import ru.rs.dao.model.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 27.10.2014.
 */
public class FirstTest {

    @Test
    public void testAdd() {
        ContactDao dao=new ContactDaoImpl();
        Contact c=new Contact();
        c.setName("Vadik");
        c.setEmail("qq@mail.ru");
        dao.addContact(c);


        List<Contact> list=new ArrayList<Contact>();
        list=dao.findAllContacts();

        for(Contact con:list) {
            System.out.println(con);
        }

    }
}

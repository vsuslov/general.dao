package ru.rs.dao.daos;

import ru.rs.dao.model.Contact;

import java.util.List;

/**
 * Created by Admin on 27.10.2014.
 */
public interface ContactDao  {

     public void addContact(Contact c);

    public Contact findByContactId(Long id);

    public List<Contact> findAllContacts();
}

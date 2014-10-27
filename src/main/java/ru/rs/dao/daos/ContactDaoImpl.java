package ru.rs.dao.daos;

import ru.rs.dao.model.Contact;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Admin on 27.10.2014.
 */
public class ContactDaoImpl implements ContactDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public void addContact(Contact c) {
         em.persist(c);
    }

    @Override
    public Contact findByContactId(Long id) {
        return em.find(Contact.class,id);
    }

    @Override
    public List<Contact> findAllContacts() {
        return (List<Contact>) em.createNamedQuery("allContacts").getResultList();
    }
}

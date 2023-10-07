package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DatabaseDAO {

	private static DatabaseDAO instance;
    private Map<UUID, Contact> database;

    private DatabaseDAO() {
        this.database = new HashMap<>();
    }

    public static synchronized DatabaseDAO getInstance() {
        if (instance == null) {
            instance = new DatabaseDAO();
        }
        return instance;
    }

    public boolean addContact(Contact contact) {
    	Contact createdContact = database.put(contact.getId(), contact);
        return createdContact != null;
    }

    public Contact getContact(UUID id) {
        return database.get(id);
    }

    public void updateContact(Contact updatedContact) {
        database.put(updatedContact.getId(), updatedContact);
    }

    public boolean deleteContact(UUID id) {
        Contact removedContact = database.remove(id);
        return removedContact != null;
    }
    
    public Collection<Contact> getAllContacts() {
        return database.values();
    }
}
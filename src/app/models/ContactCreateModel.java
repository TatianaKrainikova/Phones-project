package app.models;

import app.database.DataProvider;
import app.database.entities.Contact;

import java.util.Map;

public class ContactCreateModel {

    public Map<String, String> createContact(Contact contact) {
        return DataProvider.addData(contact, contact);
    }
}

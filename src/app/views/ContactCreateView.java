package app.views;

import app.database.entities.Contact;
import app.models.ContactCreateModel;
import app.utils.NameValidator;
import app.utils.PhoneValidator;

import java.util.Scanner;

public class ContactCreateView {

    ContactCreateModel model;
    Contact contact;
    String title;
    Scanner scanner;

    public ContactCreateView(ContactCreateModel model) {
        this.model = model;
    }

    public Contact doInputs() {
        scanner = new Scanner(System.in);
        contact = new Contact();

        title = "Enter name: ";
        System.out.println(title);
        contact.setName(NameValidator.validateNameInput(scanner));

        title = "Enter phone: ";
        System.out.println(title);
        contact.setPhone(PhoneValidator.validatePhoneInput(scanner));

        return contact;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

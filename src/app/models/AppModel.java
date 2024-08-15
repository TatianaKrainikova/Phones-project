package app.models;

import app.controllers.ContactCreateController;
import app.controllers.ContactReadController;
import app.views.ContactCreateView;
import app.views.ContactReadView;

public class AppModel {

    private int choice;

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void addContacts() {
        ContactCreateModel model = new ContactCreateModel();
        ContactCreateView view = new ContactCreateView(model);
        ContactCreateController controller = new ContactCreateController(model, view);
        controller.addContact();
    }

    public void readContact() {
        ContactReadModel model = new ContactReadModel();
        ContactReadView view = new ContactReadView(model);
        ContactReadController controller = new ContactReadController(model, view);
        controller.getContacts();
    }
}

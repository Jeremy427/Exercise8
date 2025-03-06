import java.util.ArrayList;

class ContactCollection {
    private ArrayList<ContactInfo> contacts;

    public ContactCollection() {
        contacts = new ArrayList<>();
    }


    public void addContact(ContactInfo contactInfo) {
        contacts.add(contactInfo);
    }


    public void display() {
        for (ContactInfo contact : contacts) {
            contact.display();
        }
    }
}


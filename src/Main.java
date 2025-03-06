// Jeremy Spence 1660, 3/6/25

class Main {
    public static void main(String[] args) {

        ContactInfo contactInfo1 = new ContactInfo("Jammy Sparks", "JammySparks123@gmail.com");


        BusinessContactInfo contactInfo2 = new BusinessContactInfo("David Peckham", "Davidpeckham@gmail.com", "518-316-6457");



        ContactCollection collection = new ContactCollection();


        collection.addContact(contactInfo1);
        collection.addContact(contactInfo2);


        collection.display();
    }
}
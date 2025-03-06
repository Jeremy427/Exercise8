public class BusinessContactInfo extends ContactInfo{
    private String phoneNumber;

    public BusinessContactInfo(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void display() {
        super.display();
        System.out.println(" Their phone number is " + phoneNumber);
    }
}

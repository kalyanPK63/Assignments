package treeMap_keyValuePairs;

public class Contacts {
    private long PhoneNumber;
    private String Name;
    private String Email;
    private enum Gender{
        Male, Female;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public Contacts(long phoneNumber, String name, String email) {
        PhoneNumber = phoneNumber;
        Name = name;
        Email = email;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "PhoneNumber=" + PhoneNumber +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}

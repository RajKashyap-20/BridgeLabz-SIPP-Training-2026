package OOPS.Collection.ArrayList;

import java.util.*;

class Contact {
    String name, phone, email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class AddressBook {

    ArrayList<Contact> contactList = new ArrayList<>();

    HashMap<String, Contact> nameMap = new HashMap<>();

    HashSet<String> phoneSet = new HashSet<>();

    public void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Error: Phone number " + phone + " already exists!");
            return;
        }
        Contact c = new Contact(name, phone, email);
        contactList.add(c);
        nameMap.put(name, c);
        phoneSet.add(phone);
        System.out.println("Contact added: " + name);
    }

    public void searchByName(String name) {
        Contact c = nameMap.get(name);
        System.out.println(c != null ? c : "Contact not found.");
    }

    public void deleteContact(String name) {
        Contact c = nameMap.remove(name);
        if (c != null) {
            contactList.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Deleted: " + name);
        }
    }

    public void display() {
        Collections.sort(contactList, Comparator.comparing(c -> c.name));

        for (Contact c : contactList) System.out.println(c);
    }

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rhe no of user:- ");
        int n= sc.nextInt();
        while(n!=0){
            System.out.println();
            String str=sc.next();
            String num= sc.next();
            String em= sc.next();
            ab.addContact(str, num, em);
        }
        ab.addContact("Rahul", "9876543210", "rahul@mail.com");
        ab.addContact("Ankit", "9123456789", "ankit@mail.com");

        ab.display();
        ab.searchByName("Rahul");
        ab.deleteContact("Rahul");
    }
}

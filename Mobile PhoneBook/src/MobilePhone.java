import java.util.ArrayList;
import java.util.ListIterator;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        boolean toExport = true;

        for (Contact thisContact: myContacts){
            if (thisContact.getName().equals(contact.getName())) toExport = false;

        }
        return toExport;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        boolean toExport = false;
        int index = findContact(oldContact);
        if(index != -1){
            myContacts.set(index, newContact);
            toExport = true;
        }

        return toExport;
    }

    public boolean removeContact(Contact contact){
        int index = findContact(contact);
        if (index != -1) {
            myContacts.remove(index);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact){

        return findContact(contact.getName());
    }

    public int findContact(String name){
        for (Contact thisContact: myContacts){
            if (thisContact.getName().equals(name)) return myContacts.indexOf(thisContact);

        }

        return -1;
    }

    public Contact queryContact(String name){
        int index = findContact(name);
        if (index != -1) return myContacts.get(index);
        return null;
    }

    public void printContacts(){
        for (Contact contact: myContacts){
            System.out.printf("%d. %s -> %s\n", (myContacts.indexOf(contact) + 1), contact.getName(), contact.getPhoneNumber());
        }
    }
}





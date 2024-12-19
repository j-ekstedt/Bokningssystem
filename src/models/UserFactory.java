package models;

public class UserFactory {

    public static User createUser(String type, String id, String name,String email, String phoneNumber, String password ) {
        if(type.equals("Admin")) {
            return new Admin(id, name, email, phoneNumber, password);
        }else if(type.equals("Customer")) {
            return new Customer(id, name, email, phoneNumber, password);
        }
        return null;
    }
}

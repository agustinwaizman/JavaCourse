package model;

public abstract class User {
    private static int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        id++;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        if (phoneNumber.length() > 8){
            System.out.println("El numero debe contener 8 digitos");
        } else if(phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "model.User: " + name + ", Email: "+ email+
                "\nAddress: " + address + ". Phone: "+phoneNumber;
    }
    public abstract void showDataUser();
}

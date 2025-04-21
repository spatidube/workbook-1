package com.pluralsight;

public class CellPhoneApplication {

    public static void main(String[] args) {
        CellPhone phone = new CellPhone(); // Create a new phone
        phone.model = "myModel";
        phone.carrier = "Tmobile";
        phone.serialNumber = 12;
        phone.owner = "Spati";
        phone.phoneNumber = "214-214-214";

        phone.displayInfo();

        CellPhone newPhone = new CellPhone();
        newPhone.model = "model 2.0";
        newPhone.serialNumber = 3333;
        newPhone.owner = "Dave";
        newPhone.phoneNumber = ""







    }
}

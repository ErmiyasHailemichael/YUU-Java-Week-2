package com.pluralsight.oop.CellPhoneExercise;
// blueprint --

// this is class - the blueprint
public class CellPhone {
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    // constructor-??
// Called only by new, e.g., new CellPhone() or new CellPhone(…)
    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String outgoingPhoneNumber) {
        System.out.printf("%s's phone is calling %s\n", owner, outgoingPhoneNumber);
    }

    public void dial(String outgoingPhoneNumber, String calleeName) {
        System.out.printf("%s's phone is calling %s which belongs to %s\n", owner, outgoingPhoneNumber, calleeName);
    }

    public void dial(CellPhone outgoingPhone) {
        System.out.printf("%s's phone is calling %s\n", owner, outgoingPhone.getOwner());
    }


}

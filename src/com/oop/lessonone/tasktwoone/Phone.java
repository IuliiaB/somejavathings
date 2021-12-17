package com.oop.lessonone.tasktwoone;

public class Phone {
    private int myNumber;
    private Network network;

    public Phone() {
    }

    public Phone(int number) {
        this.myNumber = number;
    }

    public Phone(int myNumber, Network network) {
        this.myNumber = myNumber;
        this.network = network;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + myNumber +
                '}';
    }

    public void registerInOperatorNetwork() {
        this.network.registerNumber(this.myNumber);
    }

    public void outboundCall(int recipientNumber) {
        if (!network.isInRegisteredNumbers(this.myNumber)) {
            System.out.println("Your phone is not registered in mobile network");
        } else {
            if (getNetwork().isInRegisteredNumbers(recipientNumber)) {
                System.out.print("Outbound call from number " + this.myNumber + ".......   ");
                network.getRegisteredPhoneByNumber(recipientNumber).inboundCall(this.myNumber);
            } else {
                System.out.println("Recipient's number is not registered in mobile network");
            }
        }
    }

    public void inboundCall(int callerNumber) {
        System.out.println("Inbound call on number " + this.myNumber + " from number " + callerNumber);
    }

}

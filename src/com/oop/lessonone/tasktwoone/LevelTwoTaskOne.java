package com.oop.lessonone.tasktwoone;

public class LevelTwoTaskOne {
    public static void main(String[] args) {
        Integer myNumberRegistered = 1112233;
        Integer myNumberNotRegisgtered = 1112234;
        Integer recipientNumberRegistered = 4445566;
        Integer recipientNumberNotRegistered = 4445567;
        Integer callerNumber = 7778899;

        Network network = new Network(10);
        network.registerNumber(myNumberRegistered);
        network.registerNumber(recipientNumberRegistered);
        //network.setRegisteredNumbers(new Integer[]{myNumberRegistered, recipientNumberRegistered});

        Phone myPhoneR = new Phone(myNumberRegistered, network);
        Phone myPhoneN = new Phone(myNumberNotRegisgtered, network);

        myPhoneN.outboundCall(recipientNumberRegistered);
        myPhoneR.outboundCall(recipientNumberNotRegistered);
        myPhoneR.outboundCall(recipientNumberRegistered);
        myPhoneR.inboundCall(callerNumber);

    }
}

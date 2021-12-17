package com.oop.lessonone.tasktwoone;

public class Network {
    private int networkSize;
    private Phone[] registeredPhones;

    public Network() {
    }

    public Network(int networkSize) {
        this.networkSize = networkSize;
        this.registeredPhones = new Phone[this.networkSize];
    }

    public Network(int networkSize, Phone[] registeredPhones) {
        this.networkSize = networkSize;
        this.registeredPhones = registeredPhones.clone();
    }

    public Phone[] getRegisteredPhones() {
        return registeredPhones;
    }

    public void setRegisteredPhones(Phone[] registeredPhones) {
        this.registeredPhones = registeredPhones.clone();
    }

    public void registerNumber(int phoneNumber) {
        for (int i = 0; i < this.registeredPhones.length; i++) {
            if (this.registeredPhones[i] == null) {
                this.registeredPhones[i] = new Phone(phoneNumber, this);
                break;
            }
        }
    }

    public boolean isInRegisteredNumbers(int number) {
        for (int i = 0; i < this.registeredPhones.length; i++) {
            if (this.registeredPhones[i] != null) {
                if (this.registeredPhones[i].getMyNumber() == number)
                    return true;
            }
        }
        return false;
    }

    public Phone getRegisteredPhoneByNumber(int number) {
        for (Phone phone: getRegisteredPhones()) {
            if (phone.getMyNumber() == number) {
                return phone;
            }
        }
        return null;
    }
}

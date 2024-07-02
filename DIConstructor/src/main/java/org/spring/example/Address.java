package org.spring.example;

public class Address {
    private int houseNo;
    private String city;
    private int postalCode;

    public Address(int houseNo, String city, int postalCode) {
        this.houseNo = houseNo;
        this.city = city;
        this.postalCode = postalCode;
    }

    public void print() {
        System.out.println("House No: " + houseNo);
        System.out.println("City: " + city);
        System.out.println("Postal Code: " + postalCode);
    }

    @Override
    public String toString() {
        return "Address [houseNo=" + houseNo + ", city=" + city + ", postalCode=" + postalCode + "]";
    }
}

package org.spring.example;

public class Address {
    private int houseNo;
    private String city;
    private int postalCode;

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPostalCode(int postalCode) {
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

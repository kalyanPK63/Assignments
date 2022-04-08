package com.restassignment.q3;

public class Area {

    private long Zipcode;
    private String State;
    private String City;
    private String country;

    public Area() {
    }

    public Area(long zipcode, String state, String city, String country) {
        Zipcode = zipcode;
        State = state;
        City = city;
        this.country = country;
    }

    public long getZipcode() {
        return Zipcode;
    }

    public void setZipcode(long zipcode) {
        Zipcode = zipcode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Area{" +
                "Zipcode=" + Zipcode +
                ", State='" + State + '\'' +
                ", City='" + City + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

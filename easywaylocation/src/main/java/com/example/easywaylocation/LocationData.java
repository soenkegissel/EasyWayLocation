package com.example.easywaylocation;

public class LocationData {
    private String city, country, country_native, pincode, full_address;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_native() {
        return country_native;
    }

    public void setCountryCustomLocale(String country_native) {
        this.country_native = country_native;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }

    public interface AddressCallBack {
        void locationData(LocationData locationData);
    }
}

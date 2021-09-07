/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author dangt
 */
public class Customer {
    private int custId;
    private String address;
    private String city;
    private String custTypeCd;
    private String fedId;
    private int postalCode;
    private String state;

    public Customer() {
    }

    public Customer(int custId, String address, String city, String custTypeCd, String fedId, int postalCode, String state) {
        this.custId = custId;
        this.address = address;
        this.city = city;
        this.custTypeCd = custTypeCd;
        this.fedId = fedId;
        this.postalCode = postalCode;
        this.state = state;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustTypeCd() {
        return custTypeCd;
    }

    public void setCustTypeCd(String custTypeCd) {
        this.custTypeCd = custTypeCd;
    }

    public String getFedId() {
        return fedId;
    }

    public void setFedId(String fedId) {
        this.fedId = fedId;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", address=" + address + ", city=" + city + ", custTypeCd=" + custTypeCd + ", fedId=" + fedId + ", postalCode=" + postalCode + ", state=" + state + '}';
    }
    
    
}

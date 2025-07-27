package com.springboot.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
    @Id
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;


    //Constructor
    public CloudVendor(){

    }
    public CloudVendor(String a, String b, String c, String d){
        vendorId=a;
        vendorName=b;
        vendorAddress=c;
        vendorPhoneNumber=d;
    }

    public void setVendorId(String a){
        vendorId=a;
    }
    public void setVendorName(String a){
        vendorName=a;
    }
    public void setVendorAddress(String a){
        vendorAddress=a;
    }
    public void setVendorPhoneNumber(String a){
        vendorPhoneNumber=a;
    }
    
    //Getters
    public String getVendorId(){
        return vendorId;
    }
    public String getVendorName(){
        return vendorName;
    }
    public String getVendorAddress(){
        return vendorAddress;
    }
    public String getVendorPhoneNumber(){
        return vendorPhoneNumber;
    }

}   

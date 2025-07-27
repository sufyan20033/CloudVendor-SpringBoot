package com.springboot.rest.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.model.CloudVendor;
import com.springboot.rest.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiService {
    CloudVendorService cloudVendorService;

    public CloudApiService(CloudVendorService c){
        cloudVendorService = c;
    }


    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
        
    };

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendor();
        
    };


    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor c){
        cloudVendorService.createCloudVendor(c);
        return ("Cloud Object has been created successfully");
    };

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor c){
        cloudVendorService.updateCloudVendor(c);
        return ("Cloud Object has been updated successfully");
    };
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable ("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return ("Cloud Object has been deleted successfully");
    };
}

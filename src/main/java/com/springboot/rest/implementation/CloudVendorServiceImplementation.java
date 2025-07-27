package com.springboot.rest.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.rest.model.CloudVendor;
import com.springboot.rest.repository.CloudVendorRepository;
import com.springboot.rest.service.CloudVendorService;


@Service
public class CloudVendorServiceImplementation implements CloudVendorService{

    CloudVendorRepository repo;

    public CloudVendorServiceImplementation(CloudVendorRepository repo){
        this.repo = repo;
    }

    @Override
    public String createCloudVendor(CloudVendor c){
        repo.save(c);
        return "Successfully stored in database";
    };
    @Override
    public String updateCloudVendor(CloudVendor c){
        repo.saveAndFlush(c);
        return "Successfully updated in database";
    };
    @Override
    public String deleteCloudVendor(String cloudVendorId){
        repo.deleteById(cloudVendorId);
        return "Successfully deleted in database";
    };

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId){
        return repo.findById(cloudVendorId).get();
    };

    @Override
    public List<CloudVendor> getAllCloudVendor(){
        return repo.findAll();
    };
}

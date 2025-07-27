package com.springboot.rest.service;

import java.util.List;

import com.springboot.rest.model.CloudVendor;


public interface  CloudVendorService {
    public String createCloudVendor(CloudVendor c);
    public String updateCloudVendor(CloudVendor c);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendor();
}

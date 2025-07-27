package com.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{

    
}

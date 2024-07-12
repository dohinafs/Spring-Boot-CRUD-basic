package com.project.rest_api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.rest_api.Model.CloudVendor;

@RestController 
@RequestMapping("/cloudvendor")	
public class CloudAPIService {
	
	CloudVendor cloudVendor;
	
	//read
	@GetMapping("/{vendorId}")

	public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
		
		return cloudVendor;
		
	}
	
	//create
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Created Successfully";
		}
	
	//update
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Updated Successfully";
		}
	
	//delete
	@DeleteMapping("/{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudVendor = null;
		return "Deleted Successfully";
		}
}

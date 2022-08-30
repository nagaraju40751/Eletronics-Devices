package com.electronics.ElectronicsDevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repositary.ElectronicsRepository;
import com.service.Electronics;

@Service
public class ElectronicsService {
	@Autowired
    private ElectronicsRepository repository;
	
	public Electronics saveElectronics(Electronics ed) {
		return repository.save(ed);
	}
	
	public List<Electronics> saveElectronicss(List<Electronics> eds) {
		return repository.saveAll(eds);
	}
	
	public List<Electronics> getElectronicss(){
		return repository.findAll();
	}
	
	public Electronics getElectronicsById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Electronics getElectronicsByName(String name) {
		return repository.findByName(name);
		
	}
	
	public String deleteElectronics(int id) {
		repository.deleteById(id);
		return "university is removed"+id;
	}
	public Electronics updateElectronics(Electronics k) {
		Electronics es=repository.findById(k.getId()).orElse(null);
		es.setName(k.getName());
		es.setCategory(k.getCategory());
		es.setPrice(k.getPrice());
		return repository.save(es);
	}

	public Optional<Electronics> getElectronics() {
		// TODO Auto-generated method stub
		return null;
	}

	

}


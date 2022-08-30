package com.repositary;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.Electronics;
@Repository
public interface ElectronicsRepository extends JpaRepository<Electronics,Integer> {

	Electronics findByName(String name);

}

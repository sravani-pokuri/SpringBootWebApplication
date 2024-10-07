package com.example.storecontroller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.storeentity.StoreEntity;
import com.example.storeservice.StoreService;

@RestController
@RequestMapping("/api")
public class StoreController {

	@Autowired
	private StoreService storeService;

	@PostMapping("/insertdata")
	public ResponseEntity<String> insertData(@RequestBody StoreEntity storeEntity) {
		storeService.insert(storeEntity);
		return ResponseEntity.ok("Data inserted successfully");
	}
	
	//TODO

	@GetMapping("/getalldata")
	public List<StoreEntity> getAllData() {
		List<StoreEntity> check = storeService.getAllData();
		Collections.sort(check, Comparator.comparing(StoreEntity::getCashAmount).reversed());
		System.out.println(check);
		return check;
		//return storeService.getAllData();
	}

}

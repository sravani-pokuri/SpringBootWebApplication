package com.example.storecontroller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.storeentity.StoreEntity;
import com.example.storeservice.StoreService;

@RestController
@RequestMapping("/api")
public class StoreController {

	@Autowired
	private StoreService storeService;

	@PostMapping("/insertdata")
    public ResponseEntity<String> insertData(@RequestParam("investmentProofs") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No file uploaded.");
        }


        if (!file.getContentType().startsWith("image/")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload a valid image file.");
        }

        storeService.saveImage(file);
        return ResponseEntity.ok("Image uploaded successfully!");
    }

	

	@GetMapping("/getalldata")
	public List<StoreEntity> getAllData() {
		List<StoreEntity> check = storeService.getAllData();
		Collections.sort(check, Comparator.comparing(StoreEntity::getCashAmount).reversed());
		System.out.println(check);
		return check;
		// return storeService.getAllData();
	}

	@GetMapping("/{id}")
	public ResponseEntity<StoreEntity> getStoreById(@PathVariable Long id) {
		StoreEntity store = storeService.getStoreById(id);
		return ResponseEntity.ok(store);
	}

	@DeleteMapping("/delete/{storeName}")
	public ResponseEntity<String> deleteProduct(@PathVariable String storeName) {
		storeService.deleteBystoreName(storeName);
		return ResponseEntity.ok("deleted successfully");
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateById(@PathVariable Long id, @RequestBody StoreEntity storeDetails) {
		storeService.updateById(id, storeDetails);
		return ResponseEntity.ok("updated successfully");

	}

}

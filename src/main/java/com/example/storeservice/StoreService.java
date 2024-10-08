package com.example.storeservice;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.storeentity.StoreEntity;
import com.example.storerepository.StoreRepository;

import jakarta.transaction.Transactional;

@Service
public class StoreService {

	@Autowired
	private StoreRepository storeRepository;

	public StoreEntity insert(StoreEntity storeEntity) {

		ZonedDateTime usDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		String formattedDate = usDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		storeEntity.setDate(formattedDate);

		return storeRepository.save(storeEntity);
	}

	public List<StoreEntity> getAllData() {

		return storeRepository.findAll();
	}
//TODO 
	public void saveData(String storeName, String date, Long cashAmount, Long cardAmount, Long totalRegisterAmount,
			Long investedAmount, byte[] investmentProofs) {

	}

	
	@Transactional
	public void deleteBystoreName(String storeName) {
		if(storeRepository.existsByStoreName(storeName)) {
			storeRepository.deleteByStoreName(storeName);
		}else {
			throw new RuntimeException("store not found with this store name " + storeName);
		}
	}

	public void updateById(Long id, StoreEntity storeDetails) {
	StoreEntity existingStore= storeRepository.findById(id)
						.orElseThrow(() -> new RuntimeException("no store details with the provided id "+id));
	
	existingStore.setCardAmount(storeDetails.getCardAmount());
	existingStore.setCashAmount(storeDetails.getCashAmount());
	existingStore.setTotalRegisterAmount(storeDetails.getTotalRegisterAmount());
	existingStore.setStoreName(storeDetails.getStoreName());
	existingStore.setInvestedAmount(storeDetails.getInvestedAmount());
	storeRepository.save(existingStore);
	}

	public void findById(Long id) {
		StoreEntity userCheck = storeRepository.findById(id)
								.orElseThrow(() -> new RuntimeException("no store existing store details found with this id"));
		storeRepository.findById(id);
		
		
	}

	public StoreEntity getStoreById(Long id) {
		return storeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("no store existing store details found with this id"));
       

		
	}
	
	

}

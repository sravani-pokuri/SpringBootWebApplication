package com.example.storeservice;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.storeentity.StoreEntity;
import com.example.storerepository.StoreRepository;

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
//TODO nothing
	public void saveData(String storeName, String date, Long cashAmount, Long cardAmount, Long totalRegisterAmount,
			Long investedAmount, byte[] investmentProofs) {

	}

}

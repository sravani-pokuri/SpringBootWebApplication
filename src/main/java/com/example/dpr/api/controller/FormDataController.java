package com.example.dpr.api.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dpr.api.entity.CompletePayloadEntity;
import com.example.dpr.api.entity.FormDataEntity;
import com.example.dpr.api.entity.YogiGetListEntity;
import com.example.dpr.api.entity.YogiNeedListEntity;
import com.example.dpr.api.service.FormDataService;
import com.example.dpr.api.service.YogiGetService;
import com.example.dpr.api.service.YogiNeedService;

@RestController
@RequestMapping("/api")
public class FormDataController {
	private static final Logger logger = LoggerFactory.getLogger(FormDataController.class);
    @Autowired
    private FormDataService formDataService;

    @Autowired
    private YogiNeedService yogiNeedService;

    @Autowired
    private YogiGetService yogiGetService;

       @PostMapping("/formData")
       public ResponseEntity<String> createFormData(@RequestBody CompletePayloadEntity completePayloadEntity) {
       logger.info("Received request to save user :{}", completePayloadEntity.getFormData());
       FormDataEntity formData = completePayloadEntity.getFormData();
       System.out.println(formData);
       formDataService.save(formData);
   

        // Save Yogi Need List
        List<YogiNeedListEntity> yogiNeedList = completePayloadEntity.getYogiNeedList();
        for (YogiNeedListEntity yogiNeed : yogiNeedList) {
            yogiNeedService.save(yogiNeed);
        }

        // Save Yogi Get List
        List<YogiGetListEntity> yogiGetList = completePayloadEntity.getYogiGetList();
        for (YogiGetListEntity yogiGet : yogiGetList) {
            yogiGetService.save(yogiGet);
        }

        return ResponseEntity.ok("Data saved successfully!");
    }

    @GetMapping("/yogiNeed")
    public List<YogiNeedListEntity> getAllYogiNeeds() {
        return yogiNeedService.findAll();
    }

    @GetMapping("/yogiGet")
    public List<YogiGetListEntity> getAllYogiGets() {
    	logger.info("Received request to fetch data");
        return yogiGetService.findAll();
    }

//    @GetMapping("/formdata")
//    public List<FormDataEntity> getAllFormData() {
//        return formDataService.findAll(); 
//    }
    
    
    @GetMapping("/formdata")
    public Page<FormDataEntity> getAllFormData(Pageable pageable) {
       logger.info("Received request to fetch all data");
    	return formDataService.findAll(pageable); //pass the pageable obj to paginate and sort the data
    }
    
    
}

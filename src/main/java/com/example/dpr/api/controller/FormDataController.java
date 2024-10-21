package com.example.dpr.api.controller;


import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @Autowired
    private FormDataService formDataService;

    @Autowired
    private YogiNeedService yogiNeedService;

    @Autowired
    private YogiGetService yogiGetService;

       @PostMapping("/formData")
       public ResponseEntity<String> createFormData(@RequestBody CompletePayloadEntity completePayloadEntity) {
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
        return yogiGetService.findAll();
    }

    @GetMapping("/formdata")
    public List<FormDataEntity> getAllFormData() {
        return formDataService.findAll();
    }

   @PostMapping("/insertdata")
   public ResponseEntity<String> insertData(@RequestBody FormDataEntity formDataEntity){
	   if(formDataEntity == null) {
		   formDataEntity.setDate(new Date());
	   }
	   formDataService.save(formDataEntity);
   
   return ResponseEntity.ok("Data inserted successfully");
}

   
	@GetMapping("/getdata")
	public ResponseEntity<List<FormDataEntity>> getData(@RequestParam("date")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date){
		List<FormDataEntity> data = formDataService.findDataByDate(date);
		if(data.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.ok(data);
			
		}
	}
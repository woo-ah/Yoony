package com.example.yoony.controller;


import com.example.yoony.controller.service.TbuserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/api/tbuser")
@RestController
public class TbuserController {

    private final TbuserService tbuserService;
    public TbuserController(
            TbuserService tbuserService
    ) {
        this.tbuserService = tbuserService;
    }

    @PostMapping("")
    public Map<String, Object> create(@RequestBody Map<String, Object> param){ //본문에 포함된 데이터를 자바 객체로 매핑
       // System.out.println(param);
        return tbuserService.create(param);
    }
    @PutMapping("")
    public Map<String, Object> update(@RequestBody Map<String, Object> param){
      //  System.out.println(param);
        return tbuserService.update(param);
    }
    @GetMapping("/get/{id}")
    public Map<String, Object> detail(@PathVariable("id") String id){
       // System.out.println(id);
        return tbuserService.get(id);
    }
}

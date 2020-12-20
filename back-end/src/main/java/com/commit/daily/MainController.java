package com.commit.daily;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class MainController {
	
	@ApiOperation(value="성공",notes="spring boot 테스트 확인 위한 컨트롤러")
	@GetMapping("/")
	public Map<String,String> getMassage(){
		
		Map<String,String> map = new HashMap<>();
		map.put("msg", "success");
		
		return map;
	}
	
}

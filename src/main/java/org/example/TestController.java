package org.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dto.HierarchicalDTO;
import dto.RequestDTO;
import dto.ResponseDTO;

@RestController
public class TestController {

	@GetMapping("/")
	public String index() {
		return "hello";
	}

	@GetMapping("/TestJSON")
	@ResponseBody
	public ResponseDTO showData(@RequestBody RequestDTO dto) {
		ResponseDTO response = new ResponseDTO();

		response.setName(dto.getName());
		response.setAge(dto.getAge());
		response.setJoinDate(dto.getJoinDate());
		response.setSecondUnit(dto.isSecondUnit());

		return response;
	}

	@GetMapping("/TestJSON2")
	@ResponseBody
	public List<ResponseDTO> showArrayData(@RequestBody List<RequestDTO> list) {
		List<ResponseDTO> resList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			ResponseDTO response = new ResponseDTO();
			
			response.setName(list.get(i).getName());
			response.setAge(list.get(i).getAge());
			response.setJoinDate(list.get(i).getJoinDate());
			response.setSecondUnit(list.get(i).isSecondUnit());
			
			resList.add(response);
		}
		return resList;
	}

	@GetMapping("/TestJSON3")
	@ResponseBody
	public List<ResponseDTO> showHierarchicalData(@RequestBody List<HierarchicalDTO> list) {
		List<ResponseDTO> resList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			ResponseDTO response = new ResponseDTO();
			
			response.setNo(list.get(i).getNo());
			response.setName(list.get(i).getData().getName());
			response.setAge(list.get(i).getData().getAge());
			response.setJoinDate(list.get(i).getData().getJoinDate());
			response.setSecondUnit(list.get(i).getData().isSecondUnit());
			
			resList.add(response);
		}
		return resList;
	}
}

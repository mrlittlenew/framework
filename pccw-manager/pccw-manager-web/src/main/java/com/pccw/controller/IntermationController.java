package com.pccw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pccw.pojo.TbInformation;
import com.pccw.service.InformationService;


@Controller
public class IntermationController {

	@Autowired
	private InformationService informationService;
	
	@RequestMapping("/info/all")
	@ResponseBody
	public List<TbInformation> getItemById() {
		List<TbInformation> list = informationService.getAll();
		return list;
	}
	
}

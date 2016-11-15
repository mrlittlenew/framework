package com.pccw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.pccw.mapper.TbInformationMapper;
import com.pccw.pojo.TbInformation;
import com.pccw.pojo.TbInformationExample;
import com.pccw.service.InformationService;


@Service
public class InformationServiceImpl implements InformationService {

	@Autowired
	private TbInformationMapper informationMapper;

	@Override
	public List<TbInformation> getAll() {
		TbInformationExample example = new TbInformationExample();
		//Criteria criteria = example.createCriteria();
		PageHelper.startPage(1, 5);
		List<TbInformation> list= informationMapper.selectByExample(example);
		return list;
	}
	
/*	@Override
	public TbItem getItemById(long itemId) {
		
		//TbItem item = itemMapper.selectByPrimaryKey(itemId);
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			TbItem item = list.get(0);
			return item;
		}
		return null;
	}
*/
	



}

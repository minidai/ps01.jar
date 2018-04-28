package com.yekj.ps01.service.impl;

import org.springframework.stereotype.Service;

import com.yekj.ps01.service.DemoServiceI;

@Service
public class DemoService implements DemoServiceI {

	@Override
	public String demos1() {
		// TODO Auto-generated method stub
		return "this is demos1";
	}

	@Override
	public String demos2() {
		// TODO Auto-generated method stub
		return "this is demos2";
	}

	@Override
	public String demos3() {
		// TODO Auto-generated method stub
		return "this is demos3";
	}

}

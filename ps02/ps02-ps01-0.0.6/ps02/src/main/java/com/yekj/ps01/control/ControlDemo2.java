package com.yekj.ps01.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yekj.ps01.service.db.DBOperationI;

@RestController
public class ControlDemo2 {

	@Autowired
	DBOperationI dbi ; 
	
	@Transactional
	@RequestMapping("demo3")
	public String demo3() {
		
		dbi.update("insert into tsunit(fid) values(123) ") ;
		dbi.update("insert into tsunit(fid) values(123) ") ;
		return "" ;
	}
}

package com.car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.dao.AdminDao;
import com.car.dto.Admin;
import com.car.exceptionss.UserNameBlankException;
@Service
public class AdminService {
	@Autowired
	private AdminDao dao;
	
	public Admin createAccount(Admin admin) {
		long count =dao.count();
		if(count==0) {
			return  dao.save(admin);
		}
		throw new UserNameBlankException("kahi pan kay");
	}
}

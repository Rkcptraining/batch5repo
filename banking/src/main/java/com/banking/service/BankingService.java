package com.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banking.dao.BankingDAOInterface;
import com.banking.entity.Employee;

@Service
@Transactional
public class BankingService implements BankingServiceInterface{
	
	
	@Autowired
	private BankingDAOInterface bDao;

	@Override
	public String createProfileService(Employee emp) {
		bDao.save(emp);
		return "record created ";
	}

}

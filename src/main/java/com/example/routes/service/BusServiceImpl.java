package com.example.routes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.routes.dao.BusDao;
import com.example.routes.model.Bus;

@Service
public class BusServiceImpl implements BusService {
	
	@Autowired
	private BusDao busDao;

	@Override
	public Bus create(Bus bus) {
		// TODO Auto-generated method stub
		Bus bus1 = busDao.findByRegistrationNumber(bus.getRegistrationNumber());
		if(bus1 != null) {
			return bus1;
		}
		return busDao.save(bus);
	}

	@Override
	public void delete(Bus bus) {
		// TODO Auto-generated method stub
		 busDao.delete(bus);
	}

	@Override
	public Bus edit(Bus bus) {
		// TODO Auto-generated method stub
		Bus bus1 = busDao.findByRegistrationNumber(bus.getRegistrationNumber());
		if(bus1 != null) {
			return bus1;
		}
		return busDao.save(bus);
	}

}

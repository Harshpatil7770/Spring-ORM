package com.crud.spring_orm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.crud.spring_orm.model.Passenger;
@Component("productDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public String addNewPassenger(Passenger passenger) {
		int result= (int) hibernateTemplate.save(passenger);
		if(result!=0) {
			return "=====New Passenger Record Added Succesfully =====";
		}
		return null;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public void updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(passenger);
		
	}

	@Override
	public List<Passenger> fetchAllRecords() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Passenger.class);
	}

	@Override
	public Passenger findById(int id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Passenger.class,id);
	}

	@Override
	@Transactional
	public void deleteById(Passenger passenger) {
		// TODO Auto-generated method stub
		 hibernateTemplate.delete(passenger);
	}

	
}

package com.crud.spring_orm.dao;

import java.util.List;

import com.crud.spring_orm.model.Passenger;

public interface PassengerDao {

	 String addNewPassenger(Passenger passenger);
	
	 void updatePassenger(Passenger passenger);
	
	 List<Passenger> fetchAllRecords();
	 
	 Passenger findById(int id);
	
	 void deleteById(Passenger passenger);
}

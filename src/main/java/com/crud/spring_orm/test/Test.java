package com.crud.spring_orm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crud.spring_orm.dao.PassengerDao;
import com.crud.spring_orm.model.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/crud/spring_orm/test/config.xml");
		
		PassengerDao passengerDao=(PassengerDao) ac.getBean("productDao");
		
		Passenger passenger=new Passenger();
		//============ Add New Passenger Record ============//
//		passenger.setId(3);
//		passenger.setFirstName("Harshawardhan");
//		passenger.setLastName("Patil");
//		passengerDao.addNewPassenger(passenger);
//		System.out.println("<=======New Passenger Added=======>"+passenger.getId());
		
		//========== Update Passenger Record =============//
		
//		passenger.setId(2);
//		passenger.setFirstName("Vaishnavi");
//		passenger.setLastName("Taral");
//		
//		passengerDao.updatePassenger(passenger);
//		System.out.println("==== Update Passenger Record Succesfully ===="+passenger.getId());
		
		//======== Fetch All Records ==========//
//		passengerDao.fetchAllRecords().forEach(System.out::println);
		
		//======== Find By Id ===========//
		
//		passengerDao.findById(2);
//		System.out.println(passengerDao.findById(2));
		
		//===== Delete By ID=========//
		
		passenger.setId(4);
		passengerDao.deleteById(passenger);
		System.out.println("== delete Passenger Record Id :: "+passenger.getId());
	}
}

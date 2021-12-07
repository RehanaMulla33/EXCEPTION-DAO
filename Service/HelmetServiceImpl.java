package com.xworkz.Assignment3.Exception.Helmet.Service;

import com.xworkz.Assignment3.Exception.Helmet.dto.HelmetDto;
import com.xworkz.Assignment3.Exception.Helmet.exception.InvalidBrand;
import com.xworkz.Assignment3.Exception.Helmet.exception.InvalidPrice;

public class HelmetServiceImpl implements HelmetService {

		boolean status=true;
		
		public HelmetServiceImpl() {
			System.out.println("Inside Service class");
		}
		public void validateSave(HelmetDto dto) throws InvalidBrand {
			if(dto.getBrand()==null || dto.getBrand().length()<2) {
				//Throwable throwable=new Throwable("Invalid Brand");
				InvalidBrand invalidBrand=new InvalidBrand("Invalid band!!");
				throw invalidBrand;
			}
			if(dto.getPrice()==0) {
				InvalidPrice invalidPrice=new InvalidPrice("Invalid price!!");
				throw invalidPrice;
			}
		
	}
	

}

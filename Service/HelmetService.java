package com.xworkz.Assignment3.Exception.Helmet.Service;

import com.xworkz.Assignment3.Exception.Helmet.dto.HelmetDto;
import com.xworkz.Assignment3.Exception.Helmet.exception.InvalidBrand;

public interface HelmetService {
	public void validateSave(HelmetDto dto) throws InvalidBrand;

}

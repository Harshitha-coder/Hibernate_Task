package com.xworkz.soap.tester;

import com.xworkz.soap.constant.SoapType;
import com.xworkz.soap.dao.SoapDAO;
import com.xworkz.soap.dao.SoapDAOImpl;
import com.xworkz.soap.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {

		SoapDTO dto = new SoapDTO(1, "Alovera", "Harshitha", true, SoapType.BATHING, false);

		SoapDTO dto1 = new SoapDTO(2, "Phenol", "Harshitha", true, SoapType.HANDWASH, true);

		SoapDAO dao = new SoapDAOImpl();
		//dao.save(dto);
		dao.save(dto1);
	}

}

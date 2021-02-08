package com.mindtree.collegedatabase.service.impl;

import java.sql.SQLException;

import com.mindtree.collegedatabase.dao.CollegeDao;
import com.mindtree.collegedatabase.dao.impl.CollegeDaoImpl;
import com.mindtree.collegedatabase.entity.College;
import com.mindtree.collegedatabase.exception.daoexception.CollegeDaoException;
import com.mindtree.collegedatabase.exception.daoexception.IdPresentException;
import com.mindtree.collegedatabase.exception.serviceexception.CollegeServiceException;
import com.mindtree.collegedatabase.service.CollegeService;

public class CollegeServiceImpl implements CollegeService {
	static CollegeDao dao=new CollegeDaoImpl();
	
	@Override
/*	public boolean checkForCollegeId(int id)throws CollegeServiceException {
		boolean is=false;
		try {
			is=dao.checkForCollegeId(id);
			System.out.println(is);
		} catch (CollegeDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//}
	//	catch(IdPresentException e) {
		//	throw new CollegeServiceException("Something is wrong in DB");
		//}
		return is;
	}
	*/
//	@Override
	public boolean insertCollegeToDb(College college)throws CollegeServiceException {	
		try {
			return dao.insertCollegeToDb(college);
		}
		catch(CollegeDaoException e){
			//throw new CollegeDaoException("something");
			System.out.println("SOmething went wrong");
		}
		return false;
	}
}

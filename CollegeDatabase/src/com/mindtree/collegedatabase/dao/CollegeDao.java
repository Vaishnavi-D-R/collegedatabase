package com.mindtree.collegedatabase.dao;

import com.mindtree.collegedatabase.entity.College;
import com.mindtree.collegedatabase.exception.daoexception.CollegeDaoException;
import com.mindtree.collegedatabase.exception.daoexception.IdPresentException;
import com.mindtree.collegedatabase.exception.serviceexception.CollegeServiceException;

public interface CollegeDao {

	//boolean checkForCollegeId(int id)throws  CollegeDaoException ;//IdPresentException,

	boolean insertCollegeToDb(College college)throws CollegeDaoException ;

	

}

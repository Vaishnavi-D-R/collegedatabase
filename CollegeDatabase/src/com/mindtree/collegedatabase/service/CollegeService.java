package com.mindtree.collegedatabase.service;

import com.mindtree.collegedatabase.entity.College;
import com.mindtree.collegedatabase.exception.daoexception.CollegeDaoException;
import com.mindtree.collegedatabase.exception.serviceexception.CollegeServiceException;

public interface CollegeService {

//	boolean checkForCollegeId(int id) throws CollegeServiceException;

	boolean insertCollegeToDb(College college) throws CollegeServiceException;

}

package com.mindtree.collegedatabase.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mindtree.collegedatabase.dao.CollegeDao;
import com.mindtree.collegedatabase.entity.College;
import com.mindtree.collegedatabase.exception.daoexception.CollegeDaoException;
import com.mindtree.collegedatabase.exception.serviceexception.CollegeServiceException;
import com.mindtree.collegedatabase.utility.DBUtility;
import com.mindtree.collegedatabase.exception.daoexception.IdPresentException;


public class CollegeDaoImpl implements CollegeDao{
	static DBUtility dbUtil=new DBUtility();
	//@Override
/*	public boolean checkForCollegeId(int id)throws CollegeDaoException{// IdPresentException  {
		int count=0;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		boolean valid=false;
		try{
			con=dbUtil.getMyConnection();
			System.out.println("Got connection");
			String query="select collegeId from colleges where collegeId=?";
			ps.setInt(1, id);
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				count=rs.getInt(1);
				if(count==id) {
					valid=true;
					break;
				}
			}
		//	if(valid==true) {
			//	throw new IdPresentException("College already is in database");
			//}
			if(ps!=null) {
				ps.close();
			}
		}
		catch(Exception e) {
			//throw new IdPresentException("College already is in database");
			System.out.println("hello");
			e.getCause();
		}finally {
			dbUtil.closeResource(con);
			dbUtil.closeResource(ps);
		}
		return valid;
	}
*/
	
	@Override
	public boolean insertCollegeToDb(College college)throws CollegeDaoException {
	/*	Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		boolean isAdded=false;
		try {
			con=dbUtil.getMyConnection();
			String query="insert into colleges values(?,?,?);";
			ps=con.prepareStatement(query);
			ps.executeQuery();
			if(ps!=null) {
			ps.close();
			}
	}
	catch(Exception e) {
		throw new CollegeDaoException("College already is in database");
	}finally {
		dbUtil.closeResource(con);
		dbUtil.closeResource(ps);
	}
	return isAdded;
	}
	*/
		boolean isInserted = false;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = dbUtil.getMyConnection();
	
			String insertQuery = "insert into colleges values(?,?,?,?,?);";
			ps = con.prepareStatement(insertQuery);

			ps.setInt(1, college.getCollegeId());
			ps.setString(2, college.getCollegeName());
			ps.setInt(3, college.getTotalStudents());

			ps.execute();
			isInserted = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.closeResource(ps);
			dbUtil.closeResource(con);
		}
		return isInserted;

	}

	

}

package com.blog.mvc.data.services;


import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO
{
	
	public int findTotalCustomer(){
		
		String sql = "SELECT COUNT(*) FROM instrument";
		 
		int total = getJdbcTemplate().queryForInt(sql);
				
		return total;
	}
	
	
}

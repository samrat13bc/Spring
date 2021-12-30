package com.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class BookDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int save(Book obj) {
		String sql = "insert into book11 values("+obj.getId()+",'"+obj.getName()+"','"+obj.getAuthor()+"')";
		return jdbcTemplate.update(sql);
	}
	
	public int update(Book obj) {
		String sql = "update book11 set name = '"+obj.getName()+"', author ="+obj.getAuthor()+" where id = "+obj.getId()+"";
		return jdbcTemplate.update(sql);
	}
	
	public int delete(Book obj) {
		String sql ="delete from book11 where id ="+obj.getId()+" ";
		return jdbcTemplate.update(sql);
		
	}
	
	public List<Book> listBooks(){
		return jdbcTemplate.query("select * from book11",new ResultSetExtractor<List<Book>>()
				{
			public List<Book> extractData(ResultSet rs) throws SQLException, DataAccessException
			{
				List<Book> l = new ArrayList<Book>();
				while(rs.next()) {
					Book b = new Book();
					b.setId(rs.getInt(1));
					b.setName(rs.getString(2));
					b.setAuthor(rs.getString(3));
					
					l.add(b);
				}
				return l;
				
			}
			
		});
	
	}

}

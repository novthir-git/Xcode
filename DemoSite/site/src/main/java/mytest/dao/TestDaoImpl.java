package mytest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao{
	@Resource
	private JdbcTemplate jdbcTemplate;
	@Override
	public void find() {
		// TODO Auto-generated method stub
		String sql="select * from blc_admin_role";
		this.jdbcTemplate.query(sql, new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				System.out.println("数据："+rs.getString("name"));
				
			}
			
		});
	}
	

}

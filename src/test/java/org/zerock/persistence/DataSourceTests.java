package org.zerock.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {

	@Autowired
	private DataSource ds;
	
	@Autowired
	private SqlSessionFactory sessionFactory;

	/*
	 * @Test public void testConnection() { long start = System.currentTimeMillis();
	 * for (int i = 0; i < 100; i++) { try (Connection con = ds.getConnection()) {
	 * log.info(con); } catch (Exception e) { e.printStackTrace();
	 * log.error(e.getMessage()); } } long end = System.currentTimeMillis();
	 * log.info("................"); log.info(end - start); }
	 */
	
	@Test
	public void testConnection2() {
		
		try(SqlSession session = sessionFactory.openSession();
				Connection con = session.getConnection()){
			
			log.info(session);
			
			log.info(con);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

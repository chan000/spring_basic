package org.ict.di;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		"file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DiTest {
	@Autowired
	private Broadcast broad;
	
	@Test
	public void testExist() {
		//assertNotNull은 ctrl+space로 임포트 시켜야 쓸 수 있습니다.
		assertNotNull(broad);
		log.info(broad);
		log.info("------------");
		
	}
	@Test
	public void testExist2() {
		assertNotNull(broad);
		log.info(broad);
		log.info("========");
	}
}

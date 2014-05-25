package org.manu.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Handles requests for the application home page.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/META-INF/spring/properties-context.xml"})
public class IntegrationTest {

	@Value("${env}")
	private String appEnvironment;

	@Test
	public void shouldPrintTestProperty(){
		System.out.println("App name = " + this.appEnvironment);
	}

}

package org.mule.modules.tests;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ConnectorTestCaseSpringBeansAddTest extends ConnectorTestCase {
	
	static final private String MY_FILE_LOCATION = "myFileLocation.xml";
	
	static {
		addConfigSpringFile(MY_FILE_LOCATION);
	}
	
	@Test
	public void testSpringFilesLocation() {
		assertEquals(2, SPRING_CONFIG_FILES.size());
		assertEquals(DEFAULT_SPRING_CONFIG_FILE, SPRING_CONFIG_FILES.get(0));
		assertEquals(MY_FILE_LOCATION, SPRING_CONFIG_FILES.get(1));
		
		String[] configSpringFiles = ConnectorTestCase.getConfigSpringFiles();
		
		assertTrue(configSpringFiles.length > 0);
		assertEquals(DEFAULT_SPRING_CONFIG_FILE, configSpringFiles[0]);
		assertEquals(MY_FILE_LOCATION, configSpringFiles[1]);
	}
}
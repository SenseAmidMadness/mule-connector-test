package org.mule.modules.tests;

import static junit.framework.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class ConnectorTestCaseSpringBeansSetTest extends ConnectorTestCase {
	
	static final private String MY_FILE_LOCATION = "myFileLocation.xml";
	
	static {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add(MY_FILE_LOCATION);
		setConfigSpringFiles(linkedList);
	}
	
	@Test
	public void testSpringFilesLocation() {
		assertEquals(1, SPRING_CONFIG_FILES.size());
		assertEquals(MY_FILE_LOCATION, SPRING_CONFIG_FILES.get(0));
	}
}

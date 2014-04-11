package org.mule.modules.tests;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestDataTests extends ConnectorTestCaseTestParent {

    private Map<String, Object> map = new HashMap<String, Object>();

    @Test(expected = UnsupportedOperationException.class)
    public void flowVarsAreImmutable() {
        map.put("foo", "unmodified");
        TestData data = new TestData().fromMap(map);
        map.put("foo", "modified");
        assertEquals("unmodified", data.getFlowVar("foo"));
        data.getFlowVars().put("foo", "modified");
    }

    @Test
    public void createDataFromMap() {
        map.put("foo", "bar");
        map.put("payloadContent", 100);
        TestData data = new TestData().fromMap(map);
        assertEquals(100, data.getPayload());
        assertEquals("bar", data.getFlowVar("foo"));
        assertEquals(1, data.getFlowVars().size());
    }

    @Test
    public void addFlowVar() {
        TestData data = new TestData().withFlowVar("foo", 42);
        assertEquals(42, data.getFlowVar("foo"));
    }

    @Test
    public void setPayload() {
        TestData data = new TestData().withPayload(1000);
        assertEquals(1000, data.getPayload());
    }

}
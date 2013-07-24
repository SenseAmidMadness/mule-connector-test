/**
 * (c) 2003-2013 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.modules.tests;

import org.mule.transport.NullPayload;

/**
 * Util class for connector tests
 *
 * @author Mulesoft, Inc
 */
public class TestUtils {

    public static Boolean assertNullPayload(Object actual) {
        return (actual instanceof NullPayload || actual.equals("{NullPayload}"));
    }
}
/*
 * Copyright 2006 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.scxml.env.faces;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SessionContextTest extends TestCase {

    public SessionContextTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(SessionContextTest.class);
    }

    public static void main(String args[]) {
        String[] testCaseName = {SessionContextTest.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

    public void testIllegalInstance() {
    	try {
            new SessionContext(null);
            fail("SessionContext successfully instantiated with"
                + " null FacesContext");
    	} catch (IllegalArgumentException iae) {
    		// expected, ignore
    	}
    }

}
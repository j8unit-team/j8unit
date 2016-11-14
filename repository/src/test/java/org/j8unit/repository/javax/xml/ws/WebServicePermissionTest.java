package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServicePermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WebServicePermission} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.WebServicePermissionTests}).
 */

@RunWith(J8Unit4.class)
public class WebServicePermissionTest
implements WebServicePermissionTests<WebServicePermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServicePermission]

    @Override
    public WebServicePermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.ws.WebServicePermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.WebServicePermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.WebServicePermission]

}

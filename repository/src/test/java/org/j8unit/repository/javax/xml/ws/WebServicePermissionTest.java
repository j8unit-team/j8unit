package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.WebServicePermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServicePermissionTest
implements org.j8unit.repository.javax.xml.ws.WebServicePermissionTests<WebServicePermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServicePermission]

    @Override
    public WebServicePermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.ws.WebServicePermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.WebServicePermission]

}

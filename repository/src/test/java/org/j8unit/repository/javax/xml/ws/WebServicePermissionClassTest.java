package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebServicePermissionClassTest
implements org.j8unit.repository.javax.xml.ws.WebServicePermissionClassTests<javax.xml.ws.WebServicePermission> {

    @Override
    public Class<javax.xml.ws.WebServicePermission> createNewSUT() {
        return javax.xml.ws.WebServicePermission.class;
    }

}

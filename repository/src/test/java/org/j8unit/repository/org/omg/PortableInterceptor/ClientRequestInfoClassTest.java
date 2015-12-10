package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClientRequestInfoClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInfoClassTests<org.omg.PortableInterceptor.ClientRequestInfo> {

    @Override
    public Class<org.omg.PortableInterceptor.ClientRequestInfo> createNewSUT() {
        return org.omg.PortableInterceptor.ClientRequestInfo.class;
    }

}

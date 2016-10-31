package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ClientRequestInfo;

@RunWith(J8Unit4.class)
public class ClientRequestInfoClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInfoClassTests<ClientRequestInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInfo]

    @Override
    public Class<ClientRequestInfo> createNewSUT() {
        return ClientRequestInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ClientRequestInfo]

}

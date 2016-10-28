package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.RequestInfo;

@RunWith(J8Unit4.class)
public class RequestInfoClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.RequestInfoClassTests<RequestInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.RequestInfo]

    @Override
    public Class<RequestInfo> createNewSUT() {
        return RequestInfo.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.RequestInfo]

}

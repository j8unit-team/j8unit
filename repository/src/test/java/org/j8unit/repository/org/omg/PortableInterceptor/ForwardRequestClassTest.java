package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForwardRequestClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ForwardRequestClassTests<org.omg.PortableInterceptor.ForwardRequest> {

    @Override
    public Class<org.omg.PortableInterceptor.ForwardRequest> createNewSUT() {
        return org.omg.PortableInterceptor.ForwardRequest.class;
    }

}

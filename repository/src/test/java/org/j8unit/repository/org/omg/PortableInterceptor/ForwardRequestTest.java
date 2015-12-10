package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForwardRequestTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ForwardRequestTests<org.omg.PortableInterceptor.ForwardRequest> {

    @Override
    public org.omg.PortableInterceptor.ForwardRequest createNewSUT() {
        return new org.omg.PortableInterceptor.ForwardRequest();
    }

}

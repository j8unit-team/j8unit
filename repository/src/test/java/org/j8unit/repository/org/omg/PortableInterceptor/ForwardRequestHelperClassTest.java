package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForwardRequestHelperClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ForwardRequestHelperClassTests<org.omg.PortableInterceptor.ForwardRequestHelper> {

    @Override
    public Class<org.omg.PortableInterceptor.ForwardRequestHelper> createNewSUT() {
        return org.omg.PortableInterceptor.ForwardRequestHelper.class;
    }

}

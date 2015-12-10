package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ORBIdHelperClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ORBIdHelperClassTests<org.omg.PortableInterceptor.ORBIdHelper> {

    @Override
    public Class<org.omg.PortableInterceptor.ORBIdHelper> createNewSUT() {
        return org.omg.PortableInterceptor.ORBIdHelper.class;
    }

}

package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerIdHelperClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ServerIdHelperClassTests<org.omg.PortableInterceptor.ServerIdHelper> {

    @Override
    public Class<org.omg.PortableInterceptor.ServerIdHelper> createNewSUT() {
        return org.omg.PortableInterceptor.ServerIdHelper.class;
    }

}

package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ACTIVEClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ACTIVEClassTests<org.omg.PortableInterceptor.ACTIVE> {

    @Override
    public Class<org.omg.PortableInterceptor.ACTIVE> createNewSUT() {
        return org.omg.PortableInterceptor.ACTIVE.class;
    }

}

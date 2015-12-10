package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class INACTIVEClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.INACTIVEClassTests<org.omg.PortableInterceptor.INACTIVE> {

    @Override
    public Class<org.omg.PortableInterceptor.INACTIVE> createNewSUT() {
        return org.omg.PortableInterceptor.INACTIVE.class;
    }

}

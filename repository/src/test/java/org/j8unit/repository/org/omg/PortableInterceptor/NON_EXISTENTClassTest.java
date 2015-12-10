package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NON_EXISTENTClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.NON_EXISTENTClassTests<org.omg.PortableInterceptor.NON_EXISTENT> {

    @Override
    public Class<org.omg.PortableInterceptor.NON_EXISTENT> createNewSUT() {
        return org.omg.PortableInterceptor.NON_EXISTENT.class;
    }

}

package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DISCARDINGClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.DISCARDINGClassTests<org.omg.PortableInterceptor.DISCARDING> {

    @Override
    public Class<org.omg.PortableInterceptor.DISCARDING> createNewSUT() {
        return org.omg.PortableInterceptor.DISCARDING.class;
    }

}

package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.DISCARDING;

@RunWith(J8Unit4.class)
public class DISCARDINGClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.DISCARDINGClassTests<DISCARDING> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.DISCARDING]

    @Override
    public Class<DISCARDING> createNewSUT() {
        return DISCARDING.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.DISCARDING]

}

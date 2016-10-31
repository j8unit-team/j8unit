package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.HOLDING;

@RunWith(J8Unit4.class)
public class HOLDINGClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.HOLDINGClassTests<HOLDING> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.HOLDING]

    @Override
    public Class<HOLDING> createNewSUT() {
        return HOLDING.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.HOLDING]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.HOLDING]

}

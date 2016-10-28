package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ACTIVE;

@RunWith(J8Unit4.class)
public class ACTIVEClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ACTIVEClassTests<ACTIVE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ACTIVE]

    @Override
    public Class<ACTIVE> createNewSUT() {
        return ACTIVE.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ACTIVE]

}

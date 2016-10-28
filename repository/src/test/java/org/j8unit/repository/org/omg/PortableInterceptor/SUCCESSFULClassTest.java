package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SUCCESSFUL;

@RunWith(J8Unit4.class)
public class SUCCESSFULClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.SUCCESSFULClassTests<SUCCESSFUL> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.SUCCESSFUL]

    @Override
    public Class<SUCCESSFUL> createNewSUT() {
        return SUCCESSFUL.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.SUCCESSFUL]

}

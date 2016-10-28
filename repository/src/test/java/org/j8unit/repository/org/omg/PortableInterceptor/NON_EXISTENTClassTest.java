package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.NON_EXISTENT;

@RunWith(J8Unit4.class)
public class NON_EXISTENTClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.NON_EXISTENTClassTests<NON_EXISTENT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.NON_EXISTENT]

    @Override
    public Class<NON_EXISTENT> createNewSUT() {
        return NON_EXISTENT.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.NON_EXISTENT]

}

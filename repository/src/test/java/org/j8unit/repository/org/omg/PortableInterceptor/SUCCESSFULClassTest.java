package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SUCCESSFUL} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.SUCCESSFULClassTests}).
 */
@RunWith(J8Unit4.class)
public class SUCCESSFULClassTest
implements SUCCESSFULClassTests<SUCCESSFUL> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.SUCCESSFUL]

    @Override
    public Class<SUCCESSFUL> createNewSUT() {
        return SUCCESSFUL.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.SUCCESSFUL]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.SUCCESSFUL]

}

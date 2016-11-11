package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link INACTIVE} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.INACTIVEClassTests}).
 */

@RunWith(J8Unit4.class)
public class INACTIVEClassTest
implements INACTIVEClassTests<INACTIVE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.INACTIVE]

    @Override
    public Class<INACTIVE> createNewSUT() {
        return INACTIVE.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.INACTIVE]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.INACTIVE]

}

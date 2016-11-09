package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ACTIVE;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ACTIVE} (by simply reusing the J8Unit
 * test interface {@link ACTIVEClassTests}).
 */

@RunWith(J8Unit4.class)
public class ACTIVEClassTest
implements ACTIVEClassTests<ACTIVE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ACTIVE]

    @Override
    public Class<ACTIVE> createNewSUT() {
        return ACTIVE.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ACTIVE]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ACTIVE]

}

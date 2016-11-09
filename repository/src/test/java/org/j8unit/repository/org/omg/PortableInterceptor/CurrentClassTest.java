package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.Current;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Current} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.CurrentClassTests}).
 */

@RunWith(J8Unit4.class)
public class CurrentClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.CurrentClassTests<Current> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.Current]

    @Override
    public Class<Current> createNewSUT() {
        return Current.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.Current]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.Current]

}

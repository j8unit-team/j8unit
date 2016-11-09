package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Void} (by simply reusing the J8Unit test
 * interface {@link VoidClassTests}).
 */

@RunWith(J8Unit4.class)
public class VoidClassTest
implements VoidClassTests<Void> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Void]

    @Override
    public Class<Void> createNewSUT() {
        return Void.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Void]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Void]

}

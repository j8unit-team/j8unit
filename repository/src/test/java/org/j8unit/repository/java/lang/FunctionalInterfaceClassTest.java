package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FunctionalInterface} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.FunctionalInterfaceClassTests}).
 */

@RunWith(J8Unit4.class)
public class FunctionalInterfaceClassTest
implements FunctionalInterfaceClassTests<FunctionalInterface> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.FunctionalInterface]

    @Override
    public Class<FunctionalInterface> createNewSUT() {
        return FunctionalInterface.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.FunctionalInterface]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.FunctionalInterface]

}

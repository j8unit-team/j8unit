package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SuppressWarnings} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.SuppressWarningsClassTests}).
 */
@RunWith(J8Unit4.class)
public class SuppressWarningsClassTest
implements SuppressWarningsClassTests<SuppressWarnings> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.SuppressWarnings]

    @Override
    public Class<SuppressWarnings> createNewSUT() {
        return SuppressWarnings.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.SuppressWarnings]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.SuppressWarnings]

}

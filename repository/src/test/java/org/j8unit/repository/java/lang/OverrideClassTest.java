package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Override} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.OverrideClassTests}).
 */
@RunWith(J8Unit4.class)
public class OverrideClassTest
implements OverrideClassTests<Override> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Override]

    @Override
    public Class<Override> createNewSUT() {
        return Override.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Override]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Override]

}

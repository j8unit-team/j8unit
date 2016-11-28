package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Deprecated} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.DeprecatedClassTests}).
 */
@RunWith(J8Unit4.class)
public class DeprecatedClassTest
implements DeprecatedClassTests<Deprecated> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Deprecated]

    @Override
    public Class<Deprecated> createNewSUT() {
        return Deprecated.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Deprecated]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Deprecated]

}

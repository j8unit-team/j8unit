package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SafeVarargs} (by simply reusing the
 * J8Unit test interface {@link SafeVarargsClassTests}).
 */

@RunWith(J8Unit4.class)
public class SafeVarargsClassTest
implements SafeVarargsClassTests<SafeVarargs> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.SafeVarargs]

    @Override
    public Class<SafeVarargs> createNewSUT() {
        return SafeVarargs.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.SafeVarargs]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.SafeVarargs]

}

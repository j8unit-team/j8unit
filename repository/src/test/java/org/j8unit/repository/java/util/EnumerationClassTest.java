package org.j8unit.repository.java.util;

import java.util.Enumeration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Enumeration} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.EnumerationClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class EnumerationClassTest
implements EnumerationClassTests<Enumeration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Enumeration]

    @Override
    public Class<Enumeration> createNewSUT() {
        return Enumeration.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Enumeration]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Enumeration]

}

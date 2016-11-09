package org.j8unit.repository.javax.naming;

import javax.naming.NamingEnumeration;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NamingEnumeration} (by simply reusing
 * the J8Unit test interface {@link NamingEnumerationTests}).
 */

@RunWith(J8Unit4.class)
public class NamingEnumerationTest<T>
implements NamingEnumerationTests<NamingEnumeration<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.NamingEnumeration]

    @Override
    public NamingEnumeration<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.NamingEnumeration], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.NamingEnumeration]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.NamingEnumeration]

}

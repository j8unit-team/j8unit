package org.j8unit.repository.javax.naming;

import javax.naming.StringRefAddr;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StringRefAddr} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.StringRefAddrTests}).
 */

@RunWith(J8Unit4.class)
public class StringRefAddrTest
implements StringRefAddrTests<StringRefAddr> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.StringRefAddr]

    @Override
    public StringRefAddr createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.StringRefAddr], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.StringRefAddr]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.StringRefAddr]

}

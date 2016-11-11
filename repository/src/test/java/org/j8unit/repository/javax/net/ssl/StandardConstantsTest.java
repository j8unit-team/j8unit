package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.StandardConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StandardConstants} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.StandardConstantsTests}).
 */

@RunWith(J8Unit4.class)
public class StandardConstantsTest
implements StandardConstantsTests<StandardConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.StandardConstants]

    @Override
    public StandardConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.net.ssl.StandardConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.StandardConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.StandardConstants]

}

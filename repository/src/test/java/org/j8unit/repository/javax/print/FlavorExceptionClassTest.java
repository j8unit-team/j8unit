package org.j8unit.repository.javax.print;

import javax.print.FlavorException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FlavorException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.FlavorExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class FlavorExceptionClassTest
implements FlavorExceptionClassTests<FlavorException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.FlavorException]

    @Override
    public Class<FlavorException> createNewSUT() {
        return FlavorException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.FlavorException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.FlavorException]

}

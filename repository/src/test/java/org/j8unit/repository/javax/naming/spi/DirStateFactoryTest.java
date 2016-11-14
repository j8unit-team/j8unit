package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.DirStateFactory;
import javax.naming.spi.DirStateFactory.Result;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DirStateFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.spi.DirStateFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class DirStateFactoryTest
implements DirStateFactoryTests<DirStateFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.DirStateFactory]

    @Override
    public DirStateFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.spi.DirStateFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.DirStateFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.DirStateFactory]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Result} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.naming.spi.DirStateFactoryTests.ResultTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ResultTest
    implements ResultTests<Result> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.DirStateFactory$Result]

        @Override
        public Result createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.spi.DirStateFactory.Result], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.DirStateFactory$Result]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.DirStateFactory$Result]

    }

}

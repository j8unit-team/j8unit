package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.DirStateFactory;
import javax.naming.spi.DirStateFactory.Result;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirStateFactoryTest
implements org.j8unit.repository.javax.naming.spi.DirStateFactoryTests<DirStateFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.DirStateFactory]

    @Override
    public DirStateFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.spi.DirStateFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.DirStateFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.DirStateFactory]

    @RunWith(J8Unit4.class)
    public static class ResultTest
    implements org.j8unit.repository.javax.naming.spi.DirStateFactoryTests.ResultTests<Result> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.DirStateFactory$Result]

        @Override
        public Result createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.spi.DirStateFactory.Result], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.DirStateFactory$Result]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.DirStateFactory$Result]

    }

}

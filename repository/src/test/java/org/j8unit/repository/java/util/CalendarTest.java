package org.j8unit.repository.java.util;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.Calendar;
import java.util.Calendar.Builder;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class CalendarTest
implements org.j8unit.repository.java.util.CalendarTests<Calendar> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Calendar]

    @Override
    public Calendar createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Calendar], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Calendar]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Calendar]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BuilderTest
    implements FactoryBasedJ8UnitTest<Builder>, org.j8unit.repository.java.util.CalendarTests.BuilderTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Calendar$Builder]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(Builder::new);
        }

        @Parameter(0)
        public Callable<Builder> sutFactory;

        @Override
        public Callable<Builder> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Calendar$Builder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Calendar$Builder]

    }

}

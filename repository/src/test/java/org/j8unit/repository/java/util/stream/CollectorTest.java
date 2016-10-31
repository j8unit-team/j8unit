package org.j8unit.repository.java.util.stream;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class CollectorTest<T, A, R>
implements org.j8unit.repository.java.util.stream.CollectorTests<Collector<T, A, R>, T, A, R> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.Collector]

    @Override
    public Collector<T, A, R> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.Collector], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.Collector]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.Collector]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class CharacteristicsTest
    implements org.j8unit.repository.java.util.stream.CollectorTests.CharacteristicsTests<Characteristics> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.Collector$Characteristics]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Characteristics.class);
        }

        @Parameter(0)
        public Characteristics sut;

        @Override
        public Characteristics createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.Collector$Characteristics]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.Collector$Characteristics]

    }

}

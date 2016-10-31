package org.j8unit.repository.javax.crypto.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.crypto.spec.PSource;
import javax.crypto.spec.PSource.PSpecified;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class PSourceTest
implements org.j8unit.repository.javax.crypto.spec.PSourceTests<PSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.PSource]

    @Override
    public PSource createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.spec.PSource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.PSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.PSource]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class PSpecifiedTest
    implements org.j8unit.repository.javax.crypto.spec.PSourceTests.PSpecifiedTests<PSpecified> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.PSource$PSpecified]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(PSpecified.DEFAULT);
        }

        @Parameter(0)
        public PSpecified sut;

        @Override
        public PSpecified createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.PSource$PSpecified]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.PSource$PSpecified]

    }

}

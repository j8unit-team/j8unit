package org.j8unit.repository.javax.crypto.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
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
implements org.j8unit.repository.javax.crypto.spec.PSourceTests<javax.crypto.spec.PSource> {

    @Override
    public javax.crypto.spec.PSource createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.crypto.spec.PSource] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class PSpecifiedTest
    implements org.j8unit.repository.javax.crypto.spec.PSourceTests.PSpecifiedTests<javax.crypto.spec.PSource.PSpecified> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.crypto.spec.PSource.PSpecified.DEFAULT);
        }

        @Parameter(0)
        public javax.crypto.spec.PSource.PSpecified sut;

        @Override
        public javax.crypto.spec.PSource.PSpecified createNewSUT() {
            return this.sut;
        }

    }

}

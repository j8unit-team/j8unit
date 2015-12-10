package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class ThreadTest
implements org.j8unit.repository.java.lang.ThreadTests<java.lang.Thread> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class StateTest
    implements org.j8unit.repository.java.lang.ThreadTests.StateTests<java.lang.Thread.State> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.lang.Thread.State.class);
        }

        @Parameter(0)
        public java.lang.Thread.State sut;

        @Override
        public java.lang.Thread.State createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public java.lang.Thread createNewSUT() {
        return new java.lang.Thread();
    }

}

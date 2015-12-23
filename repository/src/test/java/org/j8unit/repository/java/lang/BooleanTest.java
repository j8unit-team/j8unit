package org.j8unit.repository.java.lang;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class BooleanTest
implements org.j8unit.repository.java.lang.BooleanTests<java.lang.Boolean> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.lang.Boolean.TRUE, //
                                java.lang.Boolean.FALSE);
    }

    @Parameter(0)
    public java.lang.Boolean sut;

    @Override
    public java.lang.Boolean createNewSUT() {
        return this.sut;
    }

}

package org.j8unit.repository.javax.tools;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StandardLocationTest
implements org.j8unit.repository.javax.tools.StandardLocationTests<javax.tools.StandardLocation> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(javax.tools.StandardLocation.class);
    }

    @Parameter(0)
    public javax.tools.StandardLocation sut;

    @Override
    public javax.tools.StandardLocation createNewSUT() {
        return this.sut;
    }

}

package org.j8unit.repository.java.time.format;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SignStyleTest
implements org.j8unit.repository.java.time.format.SignStyleTests<java.time.format.SignStyle> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.time.format.SignStyle.class);
    }

    @Parameter(0)
    public java.time.format.SignStyle sut;

    @Override
    public java.time.format.SignStyle createNewSUT() {
        return this.sut;
    }

}

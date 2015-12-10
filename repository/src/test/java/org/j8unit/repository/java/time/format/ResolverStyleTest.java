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
public class ResolverStyleTest
implements org.j8unit.repository.java.time.format.ResolverStyleTests<java.time.format.ResolverStyle> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.time.format.ResolverStyle.class);
    }

    @Parameter(0)
    public java.time.format.ResolverStyle sut;

    @Override
    public java.time.format.ResolverStyle createNewSUT() {
        return this.sut;
    }

}

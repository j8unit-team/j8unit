package org.j8unit.repository.java.security.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PSSParameterSpecTest
implements org.j8unit.repository.java.security.spec.PSSParameterSpecTests<java.security.spec.PSSParameterSpec> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.security.spec.PSSParameterSpec.DEFAULT);
    }

    @Parameter(0)
    public java.security.spec.PSSParameterSpec sut;

    @Override
    public java.security.spec.PSSParameterSpec createNewSUT() {
        return this.sut;
    }

}

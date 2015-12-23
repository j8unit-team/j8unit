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
public class MGF1ParameterSpecTest
implements org.j8unit.repository.java.security.spec.MGF1ParameterSpecTests<java.security.spec.MGF1ParameterSpec> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.security.spec.MGF1ParameterSpec.SHA512, //
                                java.security.spec.MGF1ParameterSpec.SHA224, //
                                java.security.spec.MGF1ParameterSpec.SHA384, //
                                java.security.spec.MGF1ParameterSpec.SHA256, //
                                java.security.spec.MGF1ParameterSpec.SHA1);
    }

    @Parameter(0)
    public java.security.spec.MGF1ParameterSpec sut;

    @Override
    public java.security.spec.MGF1ParameterSpec createNewSUT() {
        return this.sut;
    }

}

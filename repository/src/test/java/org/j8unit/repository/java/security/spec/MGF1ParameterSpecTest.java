package org.j8unit.repository.java.security.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.spec.MGF1ParameterSpec;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MGF1ParameterSpecTest
implements org.j8unit.repository.java.security.spec.MGF1ParameterSpecTests<MGF1ParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.MGF1ParameterSpec]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MGF1ParameterSpec.SHA512, //
                                MGF1ParameterSpec.SHA224, //
                                MGF1ParameterSpec.SHA384, //
                                MGF1ParameterSpec.SHA256, //
                                MGF1ParameterSpec.SHA1);
    }

    @Parameter(0)
    public MGF1ParameterSpec sut;

    @Override
    public MGF1ParameterSpec createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.MGF1ParameterSpec]

}

package org.j8unit.repository.java.security.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.security.spec.PSSParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class PSSParameterSpecTest
implements org.j8unit.repository.java.security.spec.PSSParameterSpecTests<PSSParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.PSSParameterSpec]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PSSParameterSpec.DEFAULT);
    }

    @Parameter(0)
    public PSSParameterSpec sut;

    @Override
    public PSSParameterSpec createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.PSSParameterSpec]

}

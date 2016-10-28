package org.j8unit.repository.javax.crypto.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.crypto.spec.OAEPParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class OAEPParameterSpecTest
implements org.j8unit.repository.javax.crypto.spec.OAEPParameterSpecTests<OAEPParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.OAEPParameterSpec]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(OAEPParameterSpec.DEFAULT);
    }

    @Parameter(0)
    public OAEPParameterSpec sut;

    @Override
    public OAEPParameterSpec createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.OAEPParameterSpec]

}

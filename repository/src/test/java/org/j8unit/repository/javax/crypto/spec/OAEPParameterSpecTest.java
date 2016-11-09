package org.j8unit.repository.javax.crypto.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.crypto.spec.OAEPParameterSpec;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OAEPParameterSpec} (by simply reusing
 * the J8Unit test interface {@link OAEPParameterSpecTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class OAEPParameterSpecTest
implements OAEPParameterSpecTests<OAEPParameterSpec> {

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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.OAEPParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.OAEPParameterSpec]

}

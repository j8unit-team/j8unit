package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.net.StandardProtocolFamily;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class StandardProtocolFamilyTest
implements org.j8unit.repository.java.net.StandardProtocolFamilyTests<StandardProtocolFamily> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.StandardProtocolFamily]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(StandardProtocolFamily.class);
    }

    @Parameter(0)
    public StandardProtocolFamily sut;

    @Override
    public StandardProtocolFamily createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.StandardProtocolFamily]

}

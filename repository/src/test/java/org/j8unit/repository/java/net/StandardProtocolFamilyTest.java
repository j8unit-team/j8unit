package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.net.StandardProtocolFamily;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
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

package org.j8unit.repository.java.nio.file;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.nio.file.AccessMode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class AccessModeTest
implements org.j8unit.repository.java.nio.file.AccessModeTests<AccessMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.AccessMode]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(AccessMode.class);
    }

    @Parameter(0)
    public AccessMode sut;

    @Override
    public AccessMode createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.AccessMode]

}

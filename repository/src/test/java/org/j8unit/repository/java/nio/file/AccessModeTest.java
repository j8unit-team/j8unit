package org.j8unit.repository.java.nio.file;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.nio.file.AccessMode;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessMode} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.AccessModeTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AccessModeTest
implements AccessModeTests<AccessMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.AccessMode]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(AccessMode.class);
    }

    @Parameter(0)
    public AccessMode sut;

    @Override
    public AccessMode createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.AccessMode]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.AccessMode]

}

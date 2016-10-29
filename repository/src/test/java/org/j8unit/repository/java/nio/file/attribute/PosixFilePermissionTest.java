package org.j8unit.repository.java.nio.file.attribute;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.nio.file.attribute.PosixFilePermission;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PosixFilePermissionTest
implements org.j8unit.repository.java.nio.file.attribute.PosixFilePermissionTests<PosixFilePermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.PosixFilePermission]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(PosixFilePermission.class);
    }

    @Parameter(0)
    public PosixFilePermission sut;

    @Override
    public PosixFilePermission createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.PosixFilePermission]

}

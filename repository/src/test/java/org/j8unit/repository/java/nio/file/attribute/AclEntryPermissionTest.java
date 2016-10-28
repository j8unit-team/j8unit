package org.j8unit.repository.java.nio.file.attribute;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.nio.file.attribute.AclEntryPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class AclEntryPermissionTest
implements org.j8unit.repository.java.nio.file.attribute.AclEntryPermissionTests<AclEntryPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.AclEntryPermission]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(AclEntryPermission.class);
    }

    @Parameter(0)
    public AclEntryPermission sut;

    @Override
    public AclEntryPermission createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.AclEntryPermission]

}

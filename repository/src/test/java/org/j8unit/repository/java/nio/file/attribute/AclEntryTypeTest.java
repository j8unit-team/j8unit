package org.j8unit.repository.java.nio.file.attribute;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AclEntryTypeTest
implements org.j8unit.repository.java.nio.file.attribute.AclEntryTypeTests<java.nio.file.attribute.AclEntryType> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(java.nio.file.attribute.AclEntryType.class);
    }

    @Parameter(0)
    public java.nio.file.attribute.AclEntryType sut;

    @Override
    public java.nio.file.attribute.AclEntryType createNewSUT() {
        return this.sut;
    }

}

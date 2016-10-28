package org.j8unit.repository.java.lang.management;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.lang.management.MemoryType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class MemoryTypeTest
implements org.j8unit.repository.java.lang.management.MemoryTypeTests<MemoryType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.MemoryType]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(MemoryType.class);
    }

    @Parameter(0)
    public MemoryType sut;

    @Override
    public MemoryType createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.MemoryType]

}

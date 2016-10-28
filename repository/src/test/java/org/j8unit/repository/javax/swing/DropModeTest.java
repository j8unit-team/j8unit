package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.swing.DropMode;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class DropModeTest
implements org.j8unit.repository.javax.swing.DropModeTests<DropMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DropMode]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(DropMode.class);
    }

    @Parameter(0)
    public DropMode sut;

    @Override
    public DropMode createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DropMode]

}

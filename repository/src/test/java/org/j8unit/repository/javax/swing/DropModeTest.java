package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.swing.DropMode;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DropMode} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.DropModeTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DropModeTest
implements DropModeTests<DropMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.DropMode]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(DropMode.class);
    }

    @Parameter(0)
    public DropMode sut;

    @Override
    public DropMode createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.DropMode]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.DropMode]

}

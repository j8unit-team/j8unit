package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.swing.SortOrder;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SortOrder} (by simply reusing the
 * J8Unit test interface {@link SortOrderTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class SortOrderTest
implements SortOrderTests<SortOrder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SortOrder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(SortOrder.class);
    }

    @Parameter(0)
    public SortOrder sut;

    @Override
    public SortOrder createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.SortOrder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.SortOrder]

}

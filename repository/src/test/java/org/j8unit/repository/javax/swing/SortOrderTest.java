package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.swing.SortOrder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class SortOrderTest
implements org.j8unit.repository.javax.swing.SortOrderTests<SortOrder> {

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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.SortOrder]

}

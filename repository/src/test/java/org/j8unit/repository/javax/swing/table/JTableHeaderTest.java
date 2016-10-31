package org.j8unit.repository.javax.swing.table;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.table.JTableHeader;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JTableHeaderTest
implements FactoryBasedJ8UnitTest<JTableHeader>, org.j8unit.repository.javax.swing.table.JTableHeaderTests<JTableHeader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.JTableHeader]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JTableHeader::new);
    }

    @Parameter(0)
    public Callable<JTableHeader> sutFactory;

    @Override
    public Callable<JTableHeader> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.table.JTableHeader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.table.JTableHeader]

}

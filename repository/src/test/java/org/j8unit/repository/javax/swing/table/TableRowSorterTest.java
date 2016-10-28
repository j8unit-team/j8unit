package org.j8unit.repository.javax.swing.table;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TableRowSorterTest<M extends TableModel>
implements FactoryBasedJ8UnitTest<TableRowSorter<M>>, org.j8unit.repository.javax.swing.table.TableRowSorterTests<TableRowSorter<M>, M> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.TableRowSorter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(TableRowSorter::new);
    }

    @Parameter(0)
    public Callable<TableRowSorter<M>> sutFactory;

    @Override
    public Callable<TableRowSorter<M>> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.table.TableRowSorter]

}

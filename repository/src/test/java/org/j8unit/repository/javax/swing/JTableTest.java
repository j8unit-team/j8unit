package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.util.concurrent.Callable;
import javax.swing.JTable;
import javax.swing.JTable.DropLocation;
import javax.swing.JTable.PrintMode;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class JTableTest
implements FactoryBasedJ8UnitTest<JTable>, JTableTests<JTable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JTable]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(JTable::new);
    }

    @Parameter(0)
    public Callable<JTable> sutFactory;

    @Override
    public Callable<JTable> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JTable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JTable]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link DropLocation} (by simply reusing
     * the J8Unit test interface {@link DropLocationTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements DropLocationTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JTable$DropLocation]

        @Override
        public DropLocation createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JTable.DropLocation], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JTable$DropLocation]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JTable$DropLocation]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintMode} (by simply reusing the
     * J8Unit test interface {@link PrintModeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class PrintModeTest
    implements PrintModeTests<PrintMode> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JTable$PrintMode]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(PrintMode.class);
        }

        @Parameter(0)
        public PrintMode sut;

        @Override
        public PrintMode createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JTable$PrintMode]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JTable$PrintMode]

    }

}

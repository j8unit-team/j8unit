package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class JTableTest
implements org.j8unit.repository.javax.swing.JTableTests<javax.swing.JTable> {

    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements org.j8unit.repository.javax.swing.JTableTests.DropLocationTests<javax.swing.JTable.DropLocation> {

        @Override
        public javax.swing.JTable.DropLocation createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.JTable.DropLocation] available.");
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class PrintModeTest
    implements org.j8unit.repository.javax.swing.JTableTests.PrintModeTests<javax.swing.JTable.PrintMode> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(javax.swing.JTable.PrintMode.class);
        }

        @Parameter(0)
        public javax.swing.JTable.PrintMode sut;

        @Override
        public javax.swing.JTable.PrintMode createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public javax.swing.JTable createNewSUT() {
        return new javax.swing.JTable();
    }

}

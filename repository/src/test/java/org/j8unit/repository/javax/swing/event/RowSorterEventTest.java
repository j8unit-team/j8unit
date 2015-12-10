package org.j8unit.repository.javax.swing.event;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class RowSorterEventTest
implements org.j8unit.repository.javax.swing.event.RowSorterEventTests<javax.swing.event.RowSorterEvent> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.javax.swing.event.RowSorterEventTests.TypeTests<javax.swing.event.RowSorterEvent.Type> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(javax.swing.event.RowSorterEvent.Type.class);
        }

        @Parameter(0)
        public javax.swing.event.RowSorterEvent.Type sut;

        @Override
        public javax.swing.event.RowSorterEvent.Type createNewSUT() {
            return this.sut;
        }

    }

    @Override
    public javax.swing.event.RowSorterEvent createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.swing.event.RowSorterEvent] available.");
    }

}

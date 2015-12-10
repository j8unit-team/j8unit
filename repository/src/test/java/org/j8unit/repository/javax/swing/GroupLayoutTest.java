package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class GroupLayoutTest
implements org.j8unit.repository.javax.swing.GroupLayoutTests<javax.swing.GroupLayout> {

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class AlignmentTest
    implements org.j8unit.repository.javax.swing.GroupLayoutTests.AlignmentTests<javax.swing.GroupLayout.Alignment> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(javax.swing.GroupLayout.Alignment.class);
        }

        @Parameter(0)
        public javax.swing.GroupLayout.Alignment sut;

        @Override
        public javax.swing.GroupLayout.Alignment createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ParallelGroupTest
    implements org.j8unit.repository.javax.swing.GroupLayoutTests.ParallelGroupTests<javax.swing.GroupLayout.ParallelGroup> {

        @Override
        public javax.swing.GroupLayout.ParallelGroup createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.GroupLayout.ParallelGroup] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class SequentialGroupTest
    implements org.j8unit.repository.javax.swing.GroupLayoutTests.SequentialGroupTests<javax.swing.GroupLayout.SequentialGroup> {

        @Override
        public javax.swing.GroupLayout.SequentialGroup createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.GroupLayout.SequentialGroup] available.");
        }

    }

    @Override
    public javax.swing.GroupLayout createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.GroupLayout] available.");
    }

}

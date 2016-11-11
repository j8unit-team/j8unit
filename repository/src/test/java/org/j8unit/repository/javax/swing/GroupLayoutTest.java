package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.Group;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GroupLayout} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.GroupLayoutTests}).
 */

@RunWith(J8Unit4.class)
public class GroupLayoutTest
implements GroupLayoutTests<GroupLayout> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.GroupLayout]

    @Override
    public GroupLayout createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.GroupLayout], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.GroupLayout]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.GroupLayout]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Alignment} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.GroupLayoutTests.AlignmentTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class AlignmentTest
    implements AlignmentTests<Alignment> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.GroupLayout$Alignment]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Alignment.class);
        }

        @Parameter(0)
        public Alignment sut;

        @Override
        public Alignment createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.GroupLayout$Alignment]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.GroupLayout$Alignment]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ParallelGroup} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.GroupLayoutTests.ParallelGroupTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ParallelGroupTest
    implements ParallelGroupTests<ParallelGroup> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.GroupLayout$ParallelGroup]

        @Override
        public ParallelGroup createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.GroupLayout.ParallelGroup], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.GroupLayout$ParallelGroup]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.GroupLayout$ParallelGroup]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Group} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.GroupLayoutTests.GroupTests}).
     */

    @RunWith(J8Unit4.class)
    public static class GroupTest
    implements GroupTests<Group> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.GroupLayout$Group]

        @Override
        public Group createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.GroupLayout.Group], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.GroupLayout$Group]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.GroupLayout$Group]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link SequentialGroup} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.GroupLayoutTests.SequentialGroupTests}).
     */

    @RunWith(J8Unit4.class)
    public static class SequentialGroupTest
    implements SequentialGroupTests<SequentialGroup> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.GroupLayout$SequentialGroup]

        @Override
        public SequentialGroup createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.GroupLayout.SequentialGroup], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.GroupLayout$SequentialGroup]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.GroupLayout$SequentialGroup]

    }

}

package org.j8unit.repository.javax.swing;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.JTree;
import javax.swing.JTree.DropLocation;
import javax.swing.JTree.DynamicUtilTreeNode;
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
public class JTreeTest
implements FactoryBasedJ8UnitTest<JTree>, JTreeTests<JTree> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JTree]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(JTree::new);
    }

    @Parameter(0)
    public Callable<JTree> sutFactory;

    @Override
    public Callable<JTree> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JTree]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JTree]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link DynamicUtilTreeNode} (by simply
     * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.JTreeTests.DynamicUtilTreeNodeTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DynamicUtilTreeNodeTest
    implements DynamicUtilTreeNodeTests<DynamicUtilTreeNode> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JTree$DynamicUtilTreeNode]

        @Override
        public DynamicUtilTreeNode createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JTree.DynamicUtilTreeNode], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JTree$DynamicUtilTreeNode]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JTree$DynamicUtilTreeNode]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link DropLocation} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.JTreeTests.DropLocationTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements DropLocationTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JTree$DropLocation]

        @Override
        public DropLocation createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.JTree.DropLocation], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.JTree$DropLocation]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.JTree$DropLocation]

    }

}

package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.AbstractLayoutCache;
import javax.swing.tree.AbstractLayoutCache.NodeDimensions;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractLayoutCacheTest
implements org.j8unit.repository.javax.swing.tree.AbstractLayoutCacheTests<AbstractLayoutCache> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.AbstractLayoutCache]

    @Override
    public AbstractLayoutCache createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.tree.AbstractLayoutCache], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.AbstractLayoutCache]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.AbstractLayoutCache]

    @RunWith(J8Unit4.class)
    public static class NodeDimensionsTest
    implements org.j8unit.repository.javax.swing.tree.AbstractLayoutCacheTests.NodeDimensionsTests<NodeDimensions> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.AbstractLayoutCache$NodeDimensions]

        @Override
        public NodeDimensions createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.tree.AbstractLayoutCache.NodeDimensions], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.AbstractLayoutCache$NodeDimensions]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.AbstractLayoutCache$NodeDimensions]

    }

}

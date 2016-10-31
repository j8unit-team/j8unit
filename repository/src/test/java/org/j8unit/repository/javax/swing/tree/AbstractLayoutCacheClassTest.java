package org.j8unit.repository.javax.swing.tree;

import static org.junit.Assert.fail;
import javax.swing.tree.AbstractLayoutCache;
import javax.swing.tree.AbstractLayoutCache.NodeDimensions;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractLayoutCacheClassTest
implements org.j8unit.repository.javax.swing.tree.AbstractLayoutCacheClassTests<AbstractLayoutCache> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.AbstractLayoutCache]

    @Override
    public Class<AbstractLayoutCache> createNewSUT() {
        return AbstractLayoutCache.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.tree.AbstractLayoutCache#AbstractLayoutCache() public javax.swing.tree.AbstractLayoutCache()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_AbstractLayoutCache()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.AbstractLayoutCache]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.AbstractLayoutCache]

    @RunWith(J8Unit4.class)
    public static class NodeDimensionsClassTest
    implements org.j8unit.repository.javax.swing.tree.AbstractLayoutCacheClassTests.NodeDimensionsClassTests<NodeDimensions> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.AbstractLayoutCache$NodeDimensions]

        @Override
        public Class<NodeDimensions> createNewSUT() {
            return NodeDimensions.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.tree.AbstractLayoutCache.NodeDimensions#NodeDimensions() public
         * javax.swing.tree.AbstractLayoutCache$NodeDimensions()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_NodeDimensions()
        throws Exception {
            Assert.fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.AbstractLayoutCache$NodeDimensions]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.AbstractLayoutCache$NodeDimensions]

    }

}

package org.j8unit.repository.javax.swing.tree;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractLayoutCacheClassTest
implements org.j8unit.repository.javax.swing.tree.AbstractLayoutCacheClassTests<javax.swing.tree.AbstractLayoutCache> {

    @Override
    public Class<javax.swing.tree.AbstractLayoutCache> createNewSUT() {
        return javax.swing.tree.AbstractLayoutCache.class;
    }

    @RunWith(J8Unit4.class)
    public static class NodeDimensionsClassTest
    implements
    org.j8unit.repository.javax.swing.tree.AbstractLayoutCacheClassTests.NodeDimensionsClassTests<javax.swing.tree.AbstractLayoutCache.NodeDimensions> {

        @Override
        public Class<javax.swing.tree.AbstractLayoutCache.NodeDimensions> createNewSUT() {
            return javax.swing.tree.AbstractLayoutCache.NodeDimensions.class;
        }

    }

}

package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.FixedHeightLayoutCache;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FixedHeightLayoutCache} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.FixedHeightLayoutCacheClassTests}).
 */

@RunWith(J8Unit4.class)
public class FixedHeightLayoutCacheClassTest
implements FixedHeightLayoutCacheClassTests<FixedHeightLayoutCache> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.tree.FixedHeightLayoutCache]

    @Override
    public Class<FixedHeightLayoutCache> createNewSUT() {
        return FixedHeightLayoutCache.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.tree.FixedHeightLayoutCache#FixedHeightLayoutCache() public
     * javax.swing.tree.FixedHeightLayoutCache()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_FixedHeightLayoutCache()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FixedHeightLayoutCache sut = new FixedHeightLayoutCache();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.tree.FixedHeightLayoutCache]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.tree.FixedHeightLayoutCache]

}

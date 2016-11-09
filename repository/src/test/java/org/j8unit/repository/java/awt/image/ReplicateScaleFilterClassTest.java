package org.j8unit.repository.java.awt.image;

import java.awt.image.ReplicateScaleFilter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ReplicateScaleFilter} (by simply reusing
 * the J8Unit test interface {@link ReplicateScaleFilterClassTests}).
 */

@RunWith(J8Unit4.class)
public class ReplicateScaleFilterClassTest
implements ReplicateScaleFilterClassTests<ReplicateScaleFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.ReplicateScaleFilter]

    @Override
    public Class<ReplicateScaleFilter> createNewSUT() {
        return ReplicateScaleFilter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.image.ReplicateScaleFilter#ReplicateScaleFilter(int, int) public
     * java.awt.image.ReplicateScaleFilter(int,int)}.
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
    public void create_ReplicateScaleFilter_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ReplicateScaleFilter sut = null; // = new ReplicateScaleFilter(int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.ReplicateScaleFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.ReplicateScaleFilter]

}

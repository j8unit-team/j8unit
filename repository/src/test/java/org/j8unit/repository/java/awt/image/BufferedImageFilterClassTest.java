package org.j8unit.repository.java.awt.image;

import java.awt.image.BufferedImageFilter;
import java.awt.image.BufferedImageOp;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferedImageFilterClassTest
implements org.j8unit.repository.java.awt.image.BufferedImageFilterClassTests<BufferedImageFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.BufferedImageFilter]

    @Override
    public Class<BufferedImageFilter> createNewSUT() {
        return BufferedImageFilter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link BufferedImageFilter#BufferedImageFilter(BufferedImageOp) public
     * java.awt.image.BufferedImageFilter(java.awt.image.BufferedImageOp)}.
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
    public void create_BufferedImageFilter_BufferedImageOp()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BufferedImageFilter sut = null; // = new BufferedImageFilter(BufferedImageOp);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.BufferedImageFilter]

}

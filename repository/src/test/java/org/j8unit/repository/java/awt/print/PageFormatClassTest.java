package org.j8unit.repository.java.awt.print;

import java.awt.print.PageFormat;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PageFormatClassTest
implements org.j8unit.repository.java.awt.print.PageFormatClassTests<PageFormat> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.print.PageFormat]

    @Override
    public Class<PageFormat> createNewSUT() {
        return PageFormat.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.print.PageFormat#PageFormat() public
     * java.awt.print.PageFormat()}.
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
    public void create_PageFormat()
    throws Exception {
        // create new instance
        final PageFormat sut = new PageFormat();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.print.PageFormat]

}

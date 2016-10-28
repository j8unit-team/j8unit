package org.j8unit.repository.java.awt.image;

import java.awt.image.RasterFormatException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RasterFormatExceptionClassTest
implements org.j8unit.repository.java.awt.image.RasterFormatExceptionClassTests<RasterFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.RasterFormatException]

    @Override
    public Class<RasterFormatException> createNewSUT() {
        return RasterFormatException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link RasterFormatException#RasterFormatException(String) public
     * java.awt.image.RasterFormatException(java.lang.String)}.
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
    public void create_RasterFormatException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RasterFormatException sut = null; // = new RasterFormatException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.RasterFormatException]

}

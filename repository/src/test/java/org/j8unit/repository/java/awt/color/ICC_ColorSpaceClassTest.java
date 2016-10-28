package org.j8unit.repository.java.awt.color;

import java.awt.color.ICC_ColorSpace;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ICC_ColorSpaceClassTest
implements org.j8unit.repository.java.awt.color.ICC_ColorSpaceClassTests<ICC_ColorSpace> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.color.ICC_ColorSpace]

    @Override
    public Class<ICC_ColorSpace> createNewSUT() {
        return ICC_ColorSpace.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.color.ICC_ColorSpace#ICC_ColorSpace(java.awt.color.ICC_Profile) public
     * java.awt.color.ICC_ColorSpace(java.awt.color.ICC_Profile)}.
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
    public void create_ICC_ColorSpace_ICC_Profile()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ICC_ColorSpace sut = null; // = new ICC_ColorSpace(java.awt.color.ICC_Profile);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.color.ICC_ColorSpace]

}

package org.j8unit.repository.java.awt;

import java.awt.ImageCapabilities;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageCapabilitiesClassTest
implements org.j8unit.repository.java.awt.ImageCapabilitiesClassTests<ImageCapabilities> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.ImageCapabilities]

    @Override
    public Class<ImageCapabilities> createNewSUT() {
        return ImageCapabilities.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.ImageCapabilities#ImageCapabilities(boolean) public java.awt.ImageCapabilities(boolean)}.
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
    public void create_ImageCapabilities_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ImageCapabilities sut = null; // = new ImageCapabilities(boolean);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.ImageCapabilities]

}

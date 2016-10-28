package org.j8unit.repository.java.awt;

import java.awt.BufferCapabilities;
import java.awt.BufferCapabilities.FlipContents;
import java.awt.ImageCapabilities;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferCapabilitiesClassTest
implements org.j8unit.repository.java.awt.BufferCapabilitiesClassTests<BufferCapabilities> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.BufferCapabilities]

    @Override
    public Class<BufferCapabilities> createNewSUT() {
        return BufferCapabilities.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link BufferCapabilities#BufferCapabilities(ImageCapabilities, ImageCapabilities, FlipContents) public
     * java.awt.BufferCapabilities(java.awt.ImageCapabilities,java.awt.ImageCapabilities,java.awt.BufferCapabilities$FlipContents)}
     * .
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
    public void create_BufferCapabilities_ImageCapabilities_ImageCapabilities_FlipContents()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BufferCapabilities sut = null; // = new BufferCapabilities(ImageCapabilities, ImageCapabilities,
                                             // FlipContents);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.BufferCapabilities]

    @RunWith(J8Unit4.class)
    public static class FlipContentsClassTest
    implements org.j8unit.repository.java.awt.BufferCapabilitiesClassTests.FlipContentsClassTests<FlipContents> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.BufferCapabilities$FlipContents]

        @Override
        public Class<FlipContents> createNewSUT() {
            return FlipContents.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.BufferCapabilities$FlipContents]

    }

}

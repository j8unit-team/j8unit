package org.j8unit.repository.java.awt;

import java.awt.BufferCapabilities;
import java.awt.BufferCapabilities.FlipContents;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BufferCapabilities} (by simply reusing
 * the J8Unit test interface {@link BufferCapabilitiesClassTests}).
 */

@RunWith(J8Unit4.class)
public class BufferCapabilitiesClassTest
implements BufferCapabilitiesClassTests<BufferCapabilities> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.BufferCapabilities]

    @Override
    public Class<BufferCapabilities> createNewSUT() {
        return BufferCapabilities.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.BufferCapabilities#BufferCapabilities(java.awt.ImageCapabilities, java.awt.ImageCapabilities, java.awt.BufferCapabilities.FlipContents)
     * public
     * java.awt.BufferCapabilities(java.awt.ImageCapabilities,java.awt.ImageCapabilities,java.awt.BufferCapabilities$FlipContents)}.
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
        final BufferCapabilities sut = null; // = new BufferCapabilities(java.awt.ImageCapabilities,
                                             // java.awt.ImageCapabilities, java.awt.BufferCapabilities.FlipContents);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.BufferCapabilities]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.BufferCapabilities]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FlipContents} (by simply reusing the
     * J8Unit test interface {@link FlipContentsClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FlipContentsClassTest
    implements FlipContentsClassTests<FlipContents> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.BufferCapabilities$FlipContents]

        @Override
        public Class<FlipContents> createNewSUT() {
            return FlipContents.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.BufferCapabilities$FlipContents]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.BufferCapabilities$FlipContents]

    }

}

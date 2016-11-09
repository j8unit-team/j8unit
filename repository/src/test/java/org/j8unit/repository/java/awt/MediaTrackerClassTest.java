package org.j8unit.repository.java.awt;

import java.awt.MediaTracker;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MediaTracker} (by simply reusing the
 * J8Unit test interface {@link MediaTrackerClassTests}).
 */

@RunWith(J8Unit4.class)
public class MediaTrackerClassTest
implements MediaTrackerClassTests<MediaTracker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.MediaTracker]

    @Override
    public Class<MediaTracker> createNewSUT() {
        return MediaTracker.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.MediaTracker#MediaTracker(java.awt.Component) public java.awt.MediaTracker(java.awt.Component)}.
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
    public void create_MediaTracker_Component()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MediaTracker sut = null; // = new MediaTracker(java.awt.Component);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.MediaTracker]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.MediaTracker]

}

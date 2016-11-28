package org.j8unit.repository.java.applet;

import java.applet.Applet;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Applet} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.applet.AppletClassTests}).
 */
@RunWith(J8Unit4.class)
public class AppletClassTest
implements AppletClassTests<Applet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.applet.Applet]

    @Override
    public Class<Applet> createNewSUT() {
        return Applet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.applet.Applet#Applet() public
     * java.applet.Applet() throws java.awt.HeadlessException}.
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
    public void create_Applet()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Applet sut = new Applet();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.applet.Applet#newAudioClip(java.net.URL) public
     * static final java.applet.AudioClip java.applet.Applet.newAudioClip(java.net.URL)}.
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
    public void test_newAudioClip_URL()
    throws Exception {
        // write some test for {@link java.applet.Applet#newAudioClip(java.net.URL)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.applet.Applet]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.applet.Applet]

}

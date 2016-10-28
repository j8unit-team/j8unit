package org.j8unit.repository.java.applet;

import java.applet.Applet;
import java.net.URL;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppletClassTest
implements org.j8unit.repository.java.applet.AppletClassTests<Applet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.applet.Applet]

    @Override
    public Class<Applet> createNewSUT() {
        return Applet.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Applet#Applet() public java.applet.Applet()
     * throws java.awt.HeadlessException}.
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
        final Applet sut = new Applet();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Applet#newAudioClip(URL) public static final
     * java.applet.AudioClip java.applet.Applet.newAudioClip(java.net.URL)}.
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
        // write some test for {@link Applet#newAudioClip(URL)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.applet.Applet]

}

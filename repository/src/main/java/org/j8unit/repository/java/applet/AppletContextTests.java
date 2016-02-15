package org.j8unit.repository.java.applet;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.applet.AppletContext interface java.applet.AppletContext}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link AppletContextClassTests}.
 * </p>
 *
 * @see java.applet.AppletContext interface java.applet.AppletContext (the hereby targeted class-under-test class)
 * @see AppletContextClassTests AppletContextClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AppletContextTests<SUT extends java.applet.AppletContext>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.applet.AppletContext#showStatus(String) public abstract void
     * java.applet.AppletContext.showStatus(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.applet.AppletContext#showStatus(String) public abstract void
     * java.applet.AppletContext.showStatus(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AppletContext#showStatus(String) public abstract void
     *      java.applet.AppletContext.showStatus(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_showStatus_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AppletContext#getStream(String) public abstract java.io.InputStream
     * java.applet.AppletContext.getStream(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.applet.AppletContext#getStream(String) public abstract java.io.InputStream
     * java.applet.AppletContext.getStream(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AppletContext#getStream(String) public abstract java.io.InputStream
     *      java.applet.AppletContext.getStream(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStream_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AppletContext#getStreamKeys() public abstract java.util.Iterator
     * <java.lang.String> java.applet.AppletContext.getStreamKeys()}.
     *
     * <p>
     * Test method for {@link java.applet.AppletContext#getStreamKeys() public abstract java.util.Iterator
     * java.applet.AppletContext.getStreamKeys()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AppletContext#getStreamKeys() public abstract java.util.Iterator
     *      java.applet.AppletContext.getStreamKeys() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStreamKeys()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AppletContext#getAudioClip(java.net.URL) public abstract java.applet.AudioClip
     * java.applet.AppletContext.getAudioClip(java.net.URL)}.
     *
     * <p>
     * Test method for {@link java.applet.AppletContext#getAudioClip(java.net.URL) public abstract java.applet.AudioClip
     * java.applet.AppletContext.getAudioClip(java.net.URL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AppletContext#getAudioClip(java.net.URL) public abstract java.applet.AudioClip
     *      java.applet.AppletContext.getAudioClip(java.net.URL) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioClip_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AppletContext#getImage(java.net.URL) public abstract java.awt.Image
     * java.applet.AppletContext.getImage(java.net.URL)}.
     *
     * <p>
     * Test method for {@link java.applet.AppletContext#getImage(java.net.URL) public abstract java.awt.Image
     * java.applet.AppletContext.getImage(java.net.URL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AppletContext#getImage(java.net.URL) public abstract java.awt.Image
     *      java.applet.AppletContext.getImage(java.net.URL) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getImage_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AppletContext#getApplet(String) public abstract java.applet.Applet
     * java.applet.AppletContext.getApplet(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.applet.AppletContext#getApplet(String) public abstract java.applet.Applet
     * java.applet.AppletContext.getApplet(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AppletContext#getApplet(String) public abstract java.applet.Applet
     *      java.applet.AppletContext.getApplet(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getApplet_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AppletContext#showDocument(java.net.URL, String) public abstract void
     * java.applet.AppletContext.showDocument(java.net.URL,java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.applet.AppletContext#showDocument(java.net.URL, String) public abstract void
     * java.applet.AppletContext.showDocument(java.net.URL,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AppletContext#showDocument(java.net.URL, String) public abstract void
     *      java.applet.AppletContext.showDocument(java.net.URL,java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_showDocument_URL_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AppletContext#showDocument(java.net.URL) public abstract void
     * java.applet.AppletContext.showDocument(java.net.URL)}.
     *
     * <p>
     * Test method for {@link java.applet.AppletContext#showDocument(java.net.URL) public abstract void
     * java.applet.AppletContext.showDocument(java.net.URL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AppletContext#showDocument(java.net.URL) public abstract void
     *      java.applet.AppletContext.showDocument(java.net.URL) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_showDocument_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AppletContext#setStream(String, java.io.InputStream) public abstract void
     * java.applet.AppletContext.setStream(java.lang.String,java.io.InputStream) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.applet.AppletContext#setStream(String, java.io.InputStream) public abstract void
     * java.applet.AppletContext.setStream(java.lang.String,java.io.InputStream) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AppletContext#setStream(String, java.io.InputStream) public abstract void
     *      java.applet.AppletContext.setStream(java.lang.String,java.io.InputStream) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setStream_String_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AppletContext#getApplets() public abstract java.util.Enumeration
     * <java.applet.Applet> java.applet.AppletContext.getApplets()}.
     *
     * <p>
     * Test method for {@link java.applet.AppletContext#getApplets() public abstract java.util.Enumeration
     * java.applet.AppletContext.getApplets()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AppletContext#getApplets() public abstract java.util.Enumeration
     *      java.applet.AppletContext.getApplets() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getApplets()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

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
 * non-{@code static} methods) of {@linkplain java.applet.AudioClip interface java.applet.AudioClip}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link AudioClipClassTests}.
 * </p>
 *
 * @see java.applet.AudioClip interface java.applet.AudioClip (the hereby targeted class-under-test class)
 * @see AudioClipClassTests AudioClipClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AudioClipTests<SUT extends java.applet.AudioClip>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.applet.AudioClip#stop() public abstract void java.applet.AudioClip.stop()}.
     *
     * <p>
     * Test method for {@link java.applet.AudioClip#stop() public abstract void java.applet.AudioClip.stop()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AudioClip#stop() public abstract void java.applet.AudioClip.stop() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_stop()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AudioClip#loop() public abstract void java.applet.AudioClip.loop()}.
     *
     * <p>
     * Test method for {@link java.applet.AudioClip#loop() public abstract void java.applet.AudioClip.loop()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AudioClip#loop() public abstract void java.applet.AudioClip.loop() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_loop()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.applet.AudioClip#play() public abstract void java.applet.AudioClip.play()}.
     *
     * <p>
     * Test method for {@link java.applet.AudioClip#play() public abstract void java.applet.AudioClip.play()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.applet.AudioClip#play() public abstract void java.applet.AudioClip.play() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_play()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.BufferCapabilities class java.awt.BufferCapabilities}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.BufferCapabilitiesClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BufferCapabilitiesTests<SUT extends java.awt.BufferCapabilities>
extends org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.awt.BufferCapabilities$FlipContents class java.awt.BufferCapabilities$FlipContents},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.awt.BufferCapabilitiesClassTests.FlipContentsClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FlipContentsTests<SUT extends java.awt.BufferCapabilities.FlipContents>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    }

    /**
     * <p>
     * Test method for {@link java.awt.BufferCapabilities#clone() public java.lang.Object
     * java.awt.BufferCapabilities.clone()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.BufferCapabilities#getBackBufferCapabilities() public java.awt.ImageCapabilities
     * java.awt.BufferCapabilities.getBackBufferCapabilities()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBackBufferCapabilities()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.BufferCapabilities#getFlipContents() public
     * java.awt.BufferCapabilities$FlipContents java.awt.BufferCapabilities.getFlipContents()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlipContents()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.BufferCapabilities#getFrontBufferCapabilities() public java.awt.ImageCapabilities
     * java.awt.BufferCapabilities.getFrontBufferCapabilities()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFrontBufferCapabilities()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.BufferCapabilities#isFullScreenRequired() public boolean
     * java.awt.BufferCapabilities.isFullScreenRequired()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFullScreenRequired()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.BufferCapabilities#isMultiBufferAvailable() public boolean
     * java.awt.BufferCapabilities.isMultiBufferAvailable()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isMultiBufferAvailable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.BufferCapabilities#isPageFlipping() public boolean
     * java.awt.BufferCapabilities.isPageFlipping()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPageFlipping()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

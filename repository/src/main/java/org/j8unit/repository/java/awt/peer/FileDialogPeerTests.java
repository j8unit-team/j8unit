package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.peer.FileDialogPeer interface java.awt.peer.FileDialogPeer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link FileDialogPeerClassTests}.
 * </p>
 *
 * @see java.awt.peer.FileDialogPeer interface java.awt.peer.FileDialogPeer (the hereby targeted class-under-test class)
 * @see FileDialogPeerClassTests FileDialogPeerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileDialogPeerTests<SUT extends java.awt.peer.FileDialogPeer>
extends DialogPeerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.FileDialogPeer#setDirectory(String) public abstract void
     * java.awt.peer.FileDialogPeer.setDirectory(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.FileDialogPeer#setDirectory(String) public abstract void
     * java.awt.peer.FileDialogPeer.setDirectory(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.FileDialogPeer#setDirectory(String) public abstract void
     *      java.awt.peer.FileDialogPeer.setDirectory(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDirectory_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.FileDialogPeer#setFile(String) public abstract void
     * java.awt.peer.FileDialogPeer.setFile(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.FileDialogPeer#setFile(String) public abstract void
     * java.awt.peer.FileDialogPeer.setFile(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.FileDialogPeer#setFile(String) public abstract void
     *      java.awt.peer.FileDialogPeer.setFile(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFile_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.FileDialogPeer#setFilenameFilter(java.io.FilenameFilter) public abstract
     * void java.awt.peer.FileDialogPeer.setFilenameFilter(java.io.FilenameFilter)}.
     *
     * <p>
     * Test method for {@link java.awt.peer.FileDialogPeer#setFilenameFilter(java.io.FilenameFilter) public abstract
     * void java.awt.peer.FileDialogPeer.setFilenameFilter(java.io.FilenameFilter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.peer.FileDialogPeer#setFilenameFilter(java.io.FilenameFilter) public abstract void
     *      java.awt.peer.FileDialogPeer.setFilenameFilter(java.io.FilenameFilter) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFilenameFilter_FilenameFilter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

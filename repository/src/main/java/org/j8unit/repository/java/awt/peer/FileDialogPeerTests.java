package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.peer.FileDialogPeer interface java.awt.peer.FileDialogPeer}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.peer.FileDialogPeerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileDialogPeerTests<SUT extends java.awt.peer.FileDialogPeer>
extends org.j8unit.repository.java.awt.peer.DialogPeerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.FileDialogPeer#setDirectory(java.lang.String) public abstract void
     * java.awt.peer.FileDialogPeer.setDirectory(java.lang.String)}.
     * </p>
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
     * Test method for {@link java.awt.peer.FileDialogPeer#setFile(java.lang.String) public abstract void
     * java.awt.peer.FileDialogPeer.setFile(java.lang.String)}.
     * </p>
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
     * </p>
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

package org.j8unit.repository.java.awt.peer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.peer.TextFieldPeer interface java.awt.peer.TextFieldPeer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.peer.TextFieldPeerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.peer.TextFieldPeerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.peer.TextFieldPeer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextFieldPeerTests<SUT extends java.awt.peer.TextFieldPeer>
extends org.j8unit.repository.java.awt.peer.TextComponentPeerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.peer.TextFieldPeer#getMinimumSize(int) public abstract java.awt.Dimension
     * java.awt.peer.TextFieldPeer.getMinimumSize(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.peer.TextFieldPeer#getMinimumSize(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinimumSize_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.TextFieldPeer#getPreferredSize(int) public abstract java.awt.Dimension
     * java.awt.peer.TextFieldPeer.getPreferredSize(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.peer.TextFieldPeer#getPreferredSize(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreferredSize_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.TextFieldPeer#setEchoChar(char) public abstract void
     * java.awt.peer.TextFieldPeer.setEchoChar(char)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.peer.TextFieldPeer#setEchoChar(char)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setEchoChar_char()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

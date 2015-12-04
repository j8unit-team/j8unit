package org.j8unit.repository.java.awt.peer;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.peer.MouseInfoPeer interface java.awt.peer.MouseInfoPeer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.peer.MouseInfoPeerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MouseInfoPeerTests<SUT extends java.awt.peer.MouseInfoPeer>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.peer.MouseInfoPeer#fillPointWithCoords(java.awt.Point) public abstract int java.awt.peer.MouseInfoPeer.fillPointWithCoords(java.awt.Point)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fillPointWithCoords_Point() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.MouseInfoPeer#isWindowUnderMouse(java.awt.Window) public abstract boolean java.awt.peer.MouseInfoPeer.isWindowUnderMouse(java.awt.Window)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isWindowUnderMouse_Window() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

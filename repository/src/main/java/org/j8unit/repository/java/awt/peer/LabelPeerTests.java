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
 * Test class for {@link java.awt.peer.LabelPeer interface java.awt.peer.LabelPeer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.peer.LabelPeerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LabelPeerTests<SUT extends java.awt.peer.LabelPeer>
extends org.j8unit.repository.java.awt.peer.ComponentPeerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.peer.LabelPeer#setText(java.lang.String) public abstract void java.awt.peer.LabelPeer.setText(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setText_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.peer.LabelPeer#setAlignment(int) public abstract void java.awt.peer.LabelPeer.setAlignment(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAlignment_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

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
 * Test class for {@link java.awt.peer.ButtonPeer interface java.awt.peer.ButtonPeer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.peer.ButtonPeerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ButtonPeerTests<SUT extends java.awt.peer.ButtonPeer>
extends org.j8unit.repository.java.awt.peer.ComponentPeerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.peer.ButtonPeer#setLabel(java.lang.String) public abstract void java.awt.peer.ButtonPeer.setLabel(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLabel_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.javax.sound.midi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sound.midi.MetaEventListener interface javax.sound.midi.MetaEventListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.midi.MetaEventListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MetaEventListenerTests<SUT extends javax.sound.midi.MetaEventListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MetaEventListener#meta(javax.sound.midi.MetaMessage) public abstract void javax.sound.midi.MetaEventListener.meta(javax.sound.midi.MetaMessage)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_meta_MetaMessage() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

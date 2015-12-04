package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.midi.ControllerEventListener interface javax.sound.midi.ControllerEventListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.midi.ControllerEventListenerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ControllerEventListenerTests<SUT extends javax.sound.midi.ControllerEventListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.ControllerEventListener#controlChange(javax.sound.midi.ShortMessage)
     * public abstract void javax.sound.midi.ControllerEventListener.controlChange(javax.sound.midi.ShortMessage)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_controlChange_ShortMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

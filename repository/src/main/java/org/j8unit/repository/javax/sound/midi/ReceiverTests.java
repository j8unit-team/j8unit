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
 * Test class for {@link javax.sound.midi.Receiver interface javax.sound.midi.Receiver},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.midi.ReceiverClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ReceiverTests<SUT extends javax.sound.midi.Receiver>
extends org.j8unit.repository.java.lang.AutoCloseableTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Receiver#close() public abstract void javax.sound.midi.Receiver.close()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_close() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Receiver#send(javax.sound.midi.MidiMessage,long) public abstract void javax.sound.midi.Receiver.send(javax.sound.midi.MidiMessage,long)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_send_MidiMessage_long() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

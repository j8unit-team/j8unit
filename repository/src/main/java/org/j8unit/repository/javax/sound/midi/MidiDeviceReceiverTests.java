package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.midi.MidiDeviceReceiver interface javax.sound.midi.MidiDeviceReceiver}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.midi.MidiDeviceReceiverClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MidiDeviceReceiverTests<SUT extends javax.sound.midi.MidiDeviceReceiver>
extends org.j8unit.repository.javax.sound.midi.ReceiverTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDeviceReceiver#getMidiDevice() public abstract
     * javax.sound.midi.MidiDevice javax.sound.midi.MidiDeviceReceiver.getMidiDevice()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMidiDevice()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

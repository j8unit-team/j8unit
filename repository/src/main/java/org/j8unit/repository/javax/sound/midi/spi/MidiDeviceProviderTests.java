package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.midi.spi.MidiDeviceProvider class javax.sound.midi.spi.MidiDeviceProvider},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.midi.spi.MidiDeviceProviderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiDeviceProviderTests<SUT extends javax.sound.midi.spi.MidiDeviceProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiDeviceProvider#getDevice(javax.sound.midi.MidiDevice.Info) public
     * abstract javax.sound.midi.MidiDevice
     * javax.sound.midi.spi.MidiDeviceProvider.getDevice(javax.sound.midi.MidiDevice$Info)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDevice_Info()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiDeviceProvider#getDeviceInfo() public abstract
     * javax.sound.midi.MidiDevice$Info[] javax.sound.midi.spi.MidiDeviceProvider.getDeviceInfo()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeviceInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.midi.spi.MidiDeviceProvider#isDeviceSupported(javax.sound.midi.MidiDevice.Info) public boolean
     * javax.sound.midi.spi.MidiDeviceProvider.isDeviceSupported(javax.sound.midi.MidiDevice$Info)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDeviceSupported_Info()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

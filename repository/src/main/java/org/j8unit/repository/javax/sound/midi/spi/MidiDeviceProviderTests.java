package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.spi.MidiDeviceProvider class
 * javax.sound.midi.spi.MidiDeviceProvider}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MidiDeviceProviderClassTests}.
 * </p>
 *
 * @see javax.sound.midi.spi.MidiDeviceProvider class javax.sound.midi.spi.MidiDeviceProvider (the hereby targeted
 *      class-under-test class)
 * @see MidiDeviceProviderClassTests MidiDeviceProviderClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiDeviceProviderTests<SUT extends javax.sound.midi.spi.MidiDeviceProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.sound.midi.spi.MidiDeviceProvider#isDeviceSupported(javax.sound.midi.MidiDevice.Info) public boolean
     * javax.sound.midi.spi.MidiDeviceProvider.isDeviceSupported(javax.sound.midi.MidiDevice$Info)}.
     *
     * <p>
     * Test method for
     * {@link javax.sound.midi.spi.MidiDeviceProvider#isDeviceSupported(javax.sound.midi.MidiDevice.Info) public boolean
     * javax.sound.midi.spi.MidiDeviceProvider.isDeviceSupported(javax.sound.midi.MidiDevice$Info)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.spi.MidiDeviceProvider#isDeviceSupported(javax.sound.midi.MidiDevice.Info) public boolean
     *      javax.sound.midi.spi.MidiDeviceProvider.isDeviceSupported(javax.sound.midi.MidiDevice$Info) (the hereby
     *      targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiDeviceProvider#getDeviceInfo() public abstract
     * javax.sound.midi.MidiDevice$Info[] javax.sound.midi.spi.MidiDeviceProvider.getDeviceInfo()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiDeviceProvider#getDeviceInfo() public abstract
     * javax.sound.midi.MidiDevice$Info[] javax.sound.midi.spi.MidiDeviceProvider.getDeviceInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.spi.MidiDeviceProvider#getDeviceInfo() public abstract javax.sound.midi.MidiDevice$Info[]
     *      javax.sound.midi.spi.MidiDeviceProvider.getDeviceInfo() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sound.midi.spi.MidiDeviceProvider#getDevice(javax.sound.midi.MidiDevice.Info) public
     * abstract javax.sound.midi.MidiDevice
     * javax.sound.midi.spi.MidiDeviceProvider.getDevice(javax.sound.midi.MidiDevice$Info)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiDeviceProvider#getDevice(javax.sound.midi.MidiDevice.Info) public
     * abstract javax.sound.midi.MidiDevice
     * javax.sound.midi.spi.MidiDeviceProvider.getDevice(javax.sound.midi.MidiDevice$Info)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.spi.MidiDeviceProvider#getDevice(javax.sound.midi.MidiDevice.Info) public abstract
     *      javax.sound.midi.MidiDevice
     *      javax.sound.midi.spi.MidiDeviceProvider.getDevice(javax.sound.midi.MidiDevice$Info) (the hereby targeted
     *      method-under-test)
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

}

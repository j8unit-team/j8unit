package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.MidiDevice interface javax.sound.midi.MidiDevice}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MidiDeviceClassTests}.
 * </p>
 *
 * @see javax.sound.midi.MidiDevice interface javax.sound.midi.MidiDevice (the hereby targeted class-under-test class)
 * @see MidiDeviceClassTests MidiDeviceClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiDeviceTests<SUT extends javax.sound.midi.MidiDevice>
extends org.j8unit.repository.java.lang.AutoCloseableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#isOpen() public abstract boolean
     * javax.sound.midi.MidiDevice.isOpen()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#isOpen() public abstract boolean
     * javax.sound.midi.MidiDevice.isOpen()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#isOpen() public abstract boolean javax.sound.midi.MidiDevice.isOpen() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isOpen()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getReceiver() public abstract javax.sound.midi.Receiver
     * javax.sound.midi.MidiDevice.getReceiver() throws javax.sound.midi.MidiUnavailableException}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getReceiver() public abstract javax.sound.midi.Receiver
     * javax.sound.midi.MidiDevice.getReceiver() throws javax.sound.midi.MidiUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#getReceiver() public abstract javax.sound.midi.Receiver
     *      javax.sound.midi.MidiDevice.getReceiver() throws javax.sound.midi.MidiUnavailableException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReceiver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getReceivers() public abstract java.util.List
     * <javax.sound.midi.Receiver> javax.sound.midi.MidiDevice.getReceivers()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getReceivers() public abstract java.util.List
     * javax.sound.midi.MidiDevice.getReceivers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#getReceivers() public abstract java.util.List
     *      javax.sound.midi.MidiDevice.getReceivers() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReceivers()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getTransmitters() public abstract java.util.List
     * <javax.sound.midi.Transmitter> javax.sound.midi.MidiDevice.getTransmitters()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getTransmitters() public abstract java.util.List
     * javax.sound.midi.MidiDevice.getTransmitters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#getTransmitters() public abstract java.util.List
     *      javax.sound.midi.MidiDevice.getTransmitters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransmitters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getDeviceInfo() public abstract
     * javax.sound.midi.MidiDevice$Info javax.sound.midi.MidiDevice.getDeviceInfo()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getDeviceInfo() public abstract
     * javax.sound.midi.MidiDevice$Info javax.sound.midi.MidiDevice.getDeviceInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#getDeviceInfo() public abstract javax.sound.midi.MidiDevice$Info
     *      javax.sound.midi.MidiDevice.getDeviceInfo() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sound.midi.MidiDevice#getMaxTransmitters() public abstract int
     * javax.sound.midi.MidiDevice.getMaxTransmitters()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getMaxTransmitters() public abstract int
     * javax.sound.midi.MidiDevice.getMaxTransmitters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#getMaxTransmitters() public abstract int
     *      javax.sound.midi.MidiDevice.getMaxTransmitters() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMaxTransmitters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getMicrosecondPosition() public abstract long
     * javax.sound.midi.MidiDevice.getMicrosecondPosition()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getMicrosecondPosition() public abstract long
     * javax.sound.midi.MidiDevice.getMicrosecondPosition()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#getMicrosecondPosition() public abstract long
     *      javax.sound.midi.MidiDevice.getMicrosecondPosition() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMicrosecondPosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getMaxReceivers() public abstract int
     * javax.sound.midi.MidiDevice.getMaxReceivers()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getMaxReceivers() public abstract int
     * javax.sound.midi.MidiDevice.getMaxReceivers()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#getMaxReceivers() public abstract int
     *      javax.sound.midi.MidiDevice.getMaxReceivers() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMaxReceivers()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#open() public abstract void javax.sound.midi.MidiDevice.open()
     * throws javax.sound.midi.MidiUnavailableException}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#open() public abstract void javax.sound.midi.MidiDevice.open()
     * throws javax.sound.midi.MidiUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#open() public abstract void javax.sound.midi.MidiDevice.open() throws
     *      javax.sound.midi.MidiUnavailableException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getTransmitter() public abstract javax.sound.midi.Transmitter
     * javax.sound.midi.MidiDevice.getTransmitter() throws javax.sound.midi.MidiUnavailableException}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#getTransmitter() public abstract javax.sound.midi.Transmitter
     * javax.sound.midi.MidiDevice.getTransmitter() throws javax.sound.midi.MidiUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#getTransmitter() public abstract javax.sound.midi.Transmitter
     *      javax.sound.midi.MidiDevice.getTransmitter() throws javax.sound.midi.MidiUnavailableException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransmitter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#close() public abstract void
     * javax.sound.midi.MidiDevice.close()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiDevice#close() public abstract void
     * javax.sound.midi.MidiDevice.close()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice#close() public abstract void javax.sound.midi.MidiDevice.close() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.sound.midi.MidiDevice.Info class
     * javax.sound.midi.MidiDevice$Info}. The complementary j8unit test interface containing the class relevant aspects
     * is {@link MidiDeviceClassTests.InfoClassTests}.
     * </p>
     *
     * @see javax.sound.midi.MidiDevice.Info class javax.sound.midi.MidiDevice$Info (the hereby targeted
     *      class-under-test class)
     * @see MidiDeviceClassTests.InfoClassTests MidiDeviceClassTests.InfoClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InfoTests<SUT extends javax.sound.midi.MidiDevice.Info>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#hashCode() public final int
         * javax.sound.midi.MidiDevice$Info.hashCode()}.
         *
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#hashCode() public final int
         * javax.sound.midi.MidiDevice$Info.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.midi.MidiDevice.Info#hashCode() public final int javax.sound.midi.MidiDevice$Info.hashCode()
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_hashCode()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#equals(Object) public final boolean
         * javax.sound.midi.MidiDevice$Info.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#equals(Object) public final boolean
         * javax.sound.midi.MidiDevice$Info.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.midi.MidiDevice.Info#equals(Object) public final boolean
         *      javax.sound.midi.MidiDevice$Info.equals(java.lang.Object) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_equals_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#getName() public final java.lang.String
         * javax.sound.midi.MidiDevice$Info.getName()}.
         *
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#getName() public final java.lang.String
         * javax.sound.midi.MidiDevice$Info.getName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.midi.MidiDevice.Info#getName() public final java.lang.String
         *      javax.sound.midi.MidiDevice$Info.getName() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#getVersion() public final java.lang.String
         * javax.sound.midi.MidiDevice$Info.getVersion()}.
         *
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#getVersion() public final java.lang.String
         * javax.sound.midi.MidiDevice$Info.getVersion()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.midi.MidiDevice.Info#getVersion() public final java.lang.String
         *      javax.sound.midi.MidiDevice$Info.getVersion() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getVersion()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#getDescription() public final java.lang.String
         * javax.sound.midi.MidiDevice$Info.getDescription()}.
         *
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#getDescription() public final java.lang.String
         * javax.sound.midi.MidiDevice$Info.getDescription()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.midi.MidiDevice.Info#getDescription() public final java.lang.String
         *      javax.sound.midi.MidiDevice$Info.getDescription() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getDescription()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#toString() public final java.lang.String
         * javax.sound.midi.MidiDevice$Info.toString()}.
         *
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#toString() public final java.lang.String
         * javax.sound.midi.MidiDevice$Info.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.midi.MidiDevice.Info#toString() public final java.lang.String
         *      javax.sound.midi.MidiDevice$Info.toString() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#getVendor() public final java.lang.String
         * javax.sound.midi.MidiDevice$Info.getVendor()}.
         *
         * <p>
         * Test method for {@link javax.sound.midi.MidiDevice.Info#getVendor() public final java.lang.String
         * javax.sound.midi.MidiDevice$Info.getVendor()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.midi.MidiDevice.Info#getVendor() public final java.lang.String
         *      javax.sound.midi.MidiDevice$Info.getVendor() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getVendor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}

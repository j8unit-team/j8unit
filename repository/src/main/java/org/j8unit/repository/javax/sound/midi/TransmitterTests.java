package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.Transmitter interface javax.sound.midi.Transmitter}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link TransmitterClassTests}.
 * </p>
 *
 * @see javax.sound.midi.Transmitter interface javax.sound.midi.Transmitter (the hereby targeted class-under-test class)
 * @see TransmitterClassTests TransmitterClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransmitterTests<SUT extends javax.sound.midi.Transmitter>
extends org.j8unit.repository.java.lang.AutoCloseableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Transmitter#close() public abstract void
     * javax.sound.midi.Transmitter.close()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Transmitter#close() public abstract void
     * javax.sound.midi.Transmitter.close()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Transmitter#close() public abstract void javax.sound.midi.Transmitter.close() (the hereby
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
     * Test method for {@link javax.sound.midi.Transmitter#setReceiver(javax.sound.midi.Receiver) public abstract void
     * javax.sound.midi.Transmitter.setReceiver(javax.sound.midi.Receiver)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Transmitter#setReceiver(javax.sound.midi.Receiver) public abstract void
     * javax.sound.midi.Transmitter.setReceiver(javax.sound.midi.Receiver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Transmitter#setReceiver(javax.sound.midi.Receiver) public abstract void
     *      javax.sound.midi.Transmitter.setReceiver(javax.sound.midi.Receiver) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setReceiver_Receiver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Transmitter#getReceiver() public abstract javax.sound.midi.Receiver
     * javax.sound.midi.Transmitter.getReceiver()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Transmitter#getReceiver() public abstract javax.sound.midi.Receiver
     * javax.sound.midi.Transmitter.getReceiver()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Transmitter#getReceiver() public abstract javax.sound.midi.Receiver
     *      javax.sound.midi.Transmitter.getReceiver() (the hereby targeted method-under-test)
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

}

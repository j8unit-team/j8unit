package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.SysexMessage class javax.sound.midi.SysexMessage}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SysexMessageClassTests}.
 * </p>
 *
 * @see javax.sound.midi.SysexMessage class javax.sound.midi.SysexMessage (the hereby targeted class-under-test class)
 * @see SysexMessageClassTests SysexMessageClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SysexMessageTests<SUT extends javax.sound.midi.SysexMessage>
extends MidiMessageTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.SysexMessage#clone() public java.lang.Object
     * javax.sound.midi.SysexMessage.clone()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.SysexMessage#clone() public java.lang.Object
     * javax.sound.midi.SysexMessage.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.SysexMessage#clone() public java.lang.Object javax.sound.midi.SysexMessage.clone() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.SysexMessage#setMessage(int, byte[], int) public void
     * javax.sound.midi.SysexMessage.setMessage(int,byte[],int) throws javax.sound.midi.InvalidMidiDataException}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.SysexMessage#setMessage(int, byte[], int) public void
     * javax.sound.midi.SysexMessage.setMessage(int,byte[],int) throws javax.sound.midi.InvalidMidiDataException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.SysexMessage#setMessage(int, byte[], int) public void
     *      javax.sound.midi.SysexMessage.setMessage(int,byte[],int) throws javax.sound.midi.InvalidMidiDataException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMessage_int_byteArray_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.SysexMessage#setMessage(byte[], int) public void
     * javax.sound.midi.SysexMessage.setMessage(byte[],int) throws javax.sound.midi.InvalidMidiDataException}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.SysexMessage#setMessage(byte[], int) public void
     * javax.sound.midi.SysexMessage.setMessage(byte[],int) throws javax.sound.midi.InvalidMidiDataException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.SysexMessage#setMessage(byte[], int) public void
     *      javax.sound.midi.SysexMessage.setMessage(byte[],int) throws javax.sound.midi.InvalidMidiDataException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMessage_byteArray_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.SysexMessage#getData() public byte[]
     * javax.sound.midi.SysexMessage.getData()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.SysexMessage#getData() public byte[]
     * javax.sound.midi.SysexMessage.getData()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.SysexMessage#getData() public byte[] javax.sound.midi.SysexMessage.getData() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getData()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

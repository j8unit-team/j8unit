package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.MidiMessage class javax.sound.midi.MidiMessage}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MidiMessageClassTests}.
 * </p>
 *
 * @see javax.sound.midi.MidiMessage class javax.sound.midi.MidiMessage (the hereby targeted class-under-test class)
 * @see MidiMessageClassTests MidiMessageClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiMessageTests<SUT extends javax.sound.midi.MidiMessage>
extends org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiMessage#clone() public abstract java.lang.Object
     * javax.sound.midi.MidiMessage.clone()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiMessage#clone() public abstract java.lang.Object
     * javax.sound.midi.MidiMessage.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiMessage#clone() public abstract java.lang.Object javax.sound.midi.MidiMessage.clone()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.sound.midi.MidiMessage#getLength() public int
     * javax.sound.midi.MidiMessage.getLength()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiMessage#getLength() public int
     * javax.sound.midi.MidiMessage.getLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiMessage#getLength() public int javax.sound.midi.MidiMessage.getLength() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiMessage#getMessage() public byte[]
     * javax.sound.midi.MidiMessage.getMessage()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiMessage#getMessage() public byte[]
     * javax.sound.midi.MidiMessage.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiMessage#getMessage() public byte[] javax.sound.midi.MidiMessage.getMessage() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiMessage#getStatus() public int
     * javax.sound.midi.MidiMessage.getStatus()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiMessage#getStatus() public int
     * javax.sound.midi.MidiMessage.getStatus()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiMessage#getStatus() public int javax.sound.midi.MidiMessage.getStatus() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStatus()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

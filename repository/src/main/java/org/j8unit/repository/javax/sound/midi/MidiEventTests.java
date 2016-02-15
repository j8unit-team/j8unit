package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.MidiEvent class javax.sound.midi.MidiEvent}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MidiEventClassTests}.
 * </p>
 *
 * @see javax.sound.midi.MidiEvent class javax.sound.midi.MidiEvent (the hereby targeted class-under-test class)
 * @see MidiEventClassTests MidiEventClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiEventTests<SUT extends javax.sound.midi.MidiEvent>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiEvent#setTick(long) public void
     * javax.sound.midi.MidiEvent.setTick(long)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiEvent#setTick(long) public void
     * javax.sound.midi.MidiEvent.setTick(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiEvent#setTick(long) public void javax.sound.midi.MidiEvent.setTick(long) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTick_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiEvent#getMessage() public javax.sound.midi.MidiMessage
     * javax.sound.midi.MidiEvent.getMessage()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiEvent#getMessage() public javax.sound.midi.MidiMessage
     * javax.sound.midi.MidiEvent.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiEvent#getMessage() public javax.sound.midi.MidiMessage
     *      javax.sound.midi.MidiEvent.getMessage() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sound.midi.MidiEvent#getTick() public long javax.sound.midi.MidiEvent.getTick()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.MidiEvent#getTick() public long javax.sound.midi.MidiEvent.getTick()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.MidiEvent#getTick() public long javax.sound.midi.MidiEvent.getTick() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTick()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.SysexMessage;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SysexMessage} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.SysexMessageClassTests}).
 */

@RunWith(J8Unit4.class)
public class SysexMessageClassTest
implements SysexMessageClassTests<SysexMessage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.SysexMessage]

    @Override
    public Class<SysexMessage> createNewSUT() {
        return SysexMessage.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.sound.midi.SysexMessage#SysexMessage()
     * public javax.sound.midi.SysexMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_SysexMessage()
    throws Exception {
        // create new instance
        final SysexMessage sut = new SysexMessage();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.SysexMessage#SysexMessage(byte[], int) public javax.sound.midi.SysexMessage(byte[],int)
     * throws javax.sound.midi.InvalidMidiDataException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_SysexMessage_byteArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SysexMessage sut = null; // = new SysexMessage(byte[], int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.SysexMessage#SysexMessage(int, byte[], int) public
     * javax.sound.midi.SysexMessage(int,byte[],int) throws javax.sound.midi.InvalidMidiDataException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_SysexMessage_int_byteArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SysexMessage sut = null; // = new SysexMessage(int, byte[], int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.SysexMessage]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.SysexMessage]

}

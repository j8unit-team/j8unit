package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.ShortMessage;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ShortMessage} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.ShortMessageClassTests}).
 */

@RunWith(J8Unit4.class)
public class ShortMessageClassTest
implements ShortMessageClassTests<ShortMessage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.ShortMessage]

    @Override
    public Class<ShortMessage> createNewSUT() {
        return ShortMessage.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.sound.midi.ShortMessage#ShortMessage()
     * public javax.sound.midi.ShortMessage()}.
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
    public void create_ShortMessage()
    throws Exception {
        // create new instance
        final ShortMessage sut = new ShortMessage();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.ShortMessage#ShortMessage(int, int, int) public
     * javax.sound.midi.ShortMessage(int,int,int) throws javax.sound.midi.InvalidMidiDataException}.
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
    public void create_ShortMessage_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ShortMessage sut = null; // = new ShortMessage(int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.sound.midi.ShortMessage#ShortMessage(int)
     * public javax.sound.midi.ShortMessage(int) throws javax.sound.midi.InvalidMidiDataException}.
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
    public void create_ShortMessage_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ShortMessage sut = null; // = new ShortMessage(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.ShortMessage#ShortMessage(int, int, int, int) public
     * javax.sound.midi.ShortMessage(int,int,int,int) throws javax.sound.midi.InvalidMidiDataException}.
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
    public void create_ShortMessage_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ShortMessage sut = null; // = new ShortMessage(int, int, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.ShortMessage]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.ShortMessage]

}

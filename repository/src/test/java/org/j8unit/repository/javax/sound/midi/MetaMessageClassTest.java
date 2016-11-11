package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MetaMessage;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MetaMessage} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.midi.MetaMessageClassTests}).
 */

@RunWith(J8Unit4.class)
public class MetaMessageClassTest
implements MetaMessageClassTests<MetaMessage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MetaMessage]

    @Override
    public Class<MetaMessage> createNewSUT() {
        return MetaMessage.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.sound.midi.MetaMessage#MetaMessage()
     * public javax.sound.midi.MetaMessage()}.
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
    public void create_MetaMessage()
    throws Exception {
        // create new instance
        final MetaMessage sut = new MetaMessage();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.MetaMessage#MetaMessage(int, byte[], int) public
     * javax.sound.midi.MetaMessage(int,byte[],int) throws javax.sound.midi.InvalidMidiDataException}.
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
    public void create_MetaMessage_int_byteArray_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MetaMessage sut = null; // = new MetaMessage(int, byte[], int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.MetaMessage]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MetaMessage]

}

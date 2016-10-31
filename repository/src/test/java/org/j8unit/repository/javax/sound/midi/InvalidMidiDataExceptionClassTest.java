package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.InvalidMidiDataException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidMidiDataExceptionClassTest
implements org.j8unit.repository.javax.sound.midi.InvalidMidiDataExceptionClassTests<InvalidMidiDataException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.InvalidMidiDataException]

    @Override
    public Class<InvalidMidiDataException> createNewSUT() {
        return InvalidMidiDataException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.InvalidMidiDataException#InvalidMidiDataException() public
     * javax.sound.midi.InvalidMidiDataException()}.
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
    public void create_InvalidMidiDataException()
    throws Exception {
        // create new instance
        final InvalidMidiDataException sut = new InvalidMidiDataException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.InvalidMidiDataException#InvalidMidiDataException(String) public
     * javax.sound.midi.InvalidMidiDataException(java.lang.String)}.
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
    public void create_InvalidMidiDataException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidMidiDataException sut = null; // = new InvalidMidiDataException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.InvalidMidiDataException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.InvalidMidiDataException]

}

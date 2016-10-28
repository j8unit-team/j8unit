package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiUnavailableException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiUnavailableExceptionClassTest
implements org.j8unit.repository.javax.sound.midi.MidiUnavailableExceptionClassTests<MidiUnavailableException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.MidiUnavailableException]

    @Override
    public Class<MidiUnavailableException> createNewSUT() {
        return MidiUnavailableException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.MidiUnavailableException#MidiUnavailableException() public
     * javax.sound.midi.MidiUnavailableException()}.
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
    public void create_MidiUnavailableException()
    throws Exception {
        // create new instance
        final MidiUnavailableException sut = new MidiUnavailableException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.MidiUnavailableException#MidiUnavailableException(String) public
     * javax.sound.midi.MidiUnavailableException(java.lang.String)}.
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
    public void create_MidiUnavailableException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MidiUnavailableException sut = null; // = new MidiUnavailableException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.MidiUnavailableException]

}

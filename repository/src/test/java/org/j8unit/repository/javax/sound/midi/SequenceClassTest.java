package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Sequence;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Sequence} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sound.midi.SequenceClassTests}).
 */
@RunWith(J8Unit4.class)
public class SequenceClassTest
implements SequenceClassTests<Sequence> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.Sequence]

    @Override
    public Class<Sequence> createNewSUT() {
        return Sequence.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.sound.midi.Sequence#Sequence(float, int)
     * public javax.sound.midi.Sequence(float,int) throws javax.sound.midi.InvalidMidiDataException}.
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
    public void create_Sequence_float_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Sequence sut = null; // = new Sequence(float, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.Sequence#Sequence(float, int, int) public javax.sound.midi.Sequence(float,int,int) throws
     * javax.sound.midi.InvalidMidiDataException}.
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
    public void create_Sequence_float_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Sequence sut = null; // = new Sequence(float, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.Sequence]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.Sequence]

}

package org.j8unit.repository.javax.sound.midi.spi;

import static org.junit.Assert.fail;
import javax.sound.midi.spi.MidiFileWriter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MidiFileWriter} (by simply reusing the
 * J8Unit test interface {@link MidiFileWriterClassTests}).
 */

@RunWith(J8Unit4.class)
public class MidiFileWriterClassTest
implements MidiFileWriterClassTests<MidiFileWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.spi.MidiFileWriter]

    @Override
    public Class<MidiFileWriter> createNewSUT() {
        return MidiFileWriter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.spi.MidiFileWriter#MidiFileWriter() public javax.sound.midi.spi.MidiFileWriter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_MidiFileWriter()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.midi.spi.MidiFileWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.spi.MidiFileWriter]

}

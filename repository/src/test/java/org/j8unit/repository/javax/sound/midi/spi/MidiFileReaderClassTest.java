package org.j8unit.repository.javax.sound.midi.spi;

import static org.junit.Assert.fail;
import javax.sound.midi.spi.MidiFileReader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MidiFileReaderClassTest
implements org.j8unit.repository.javax.sound.midi.spi.MidiFileReaderClassTests<MidiFileReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.midi.spi.MidiFileReader]

    @Override
    public Class<MidiFileReader> createNewSUT() {
        return MidiFileReader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.midi.spi.MidiFileReader#MidiFileReader() public javax.sound.midi.spi.MidiFileReader()}.
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
    public void create_MidiFileReader()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.midi.spi.MidiFileReader]

}

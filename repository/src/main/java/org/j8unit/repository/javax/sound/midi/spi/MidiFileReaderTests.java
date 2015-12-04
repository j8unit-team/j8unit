package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.midi.spi.MidiFileReader class javax.sound.midi.spi.MidiFileReader}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.midi.spi.MidiFileReaderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MidiFileReaderTests<SUT extends javax.sound.midi.spi.MidiFileReader>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getMidiFileFormat(java.io.File) public abstract
     * javax.sound.midi.MidiFileFormat javax.sound.midi.spi.MidiFileReader.getMidiFileFormat(java.io.File) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMidiFileFormat_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getMidiFileFormat(java.net.URL) public abstract
     * javax.sound.midi.MidiFileFormat javax.sound.midi.spi.MidiFileReader.getMidiFileFormat(java.net.URL) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMidiFileFormat_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getMidiFileFormat(java.io.InputStream) public abstract
     * javax.sound.midi.MidiFileFormat javax.sound.midi.spi.MidiFileReader.getMidiFileFormat(java.io.InputStream) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMidiFileFormat_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getSequence(java.io.File) public abstract
     * javax.sound.midi.Sequence javax.sound.midi.spi.MidiFileReader.getSequence(java.io.File) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSequence_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getSequence(java.net.URL) public abstract
     * javax.sound.midi.Sequence javax.sound.midi.spi.MidiFileReader.getSequence(java.net.URL) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSequence_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getSequence(java.io.InputStream) public abstract
     * javax.sound.midi.Sequence javax.sound.midi.spi.MidiFileReader.getSequence(java.io.InputStream) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSequence_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

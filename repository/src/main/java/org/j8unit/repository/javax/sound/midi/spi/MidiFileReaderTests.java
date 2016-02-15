package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.spi.MidiFileReader class
 * javax.sound.midi.spi.MidiFileReader}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MidiFileReaderClassTests}.
 * </p>
 *
 * @see javax.sound.midi.spi.MidiFileReader class javax.sound.midi.spi.MidiFileReader (the hereby targeted
 *      class-under-test class)
 * @see MidiFileReaderClassTests MidiFileReaderClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiFileReaderTests<SUT extends javax.sound.midi.spi.MidiFileReader>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getMidiFileFormat(java.io.File) public abstract
     * javax.sound.midi.MidiFileFormat javax.sound.midi.spi.MidiFileReader.getMidiFileFormat(java.io.File) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getMidiFileFormat(java.io.File) public abstract
     * javax.sound.midi.MidiFileFormat javax.sound.midi.spi.MidiFileReader.getMidiFileFormat(java.io.File) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.spi.MidiFileReader#getMidiFileFormat(java.io.File) public abstract
     *      javax.sound.midi.MidiFileFormat javax.sound.midi.spi.MidiFileReader.getMidiFileFormat(java.io.File) throws
     *      javax.sound.midi.InvalidMidiDataException,java.io.IOException (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getMidiFileFormat(java.net.URL) public abstract
     * javax.sound.midi.MidiFileFormat javax.sound.midi.spi.MidiFileReader.getMidiFileFormat(java.net.URL) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.spi.MidiFileReader#getMidiFileFormat(java.net.URL) public abstract
     *      javax.sound.midi.MidiFileFormat javax.sound.midi.spi.MidiFileReader.getMidiFileFormat(java.net.URL) throws
     *      javax.sound.midi.InvalidMidiDataException,java.io.IOException (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getMidiFileFormat(java.io.InputStream) public abstract
     * javax.sound.midi.MidiFileFormat javax.sound.midi.spi.MidiFileReader.getMidiFileFormat(java.io.InputStream) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.spi.MidiFileReader#getMidiFileFormat(java.io.InputStream) public abstract
     *      javax.sound.midi.MidiFileFormat javax.sound.midi.spi.MidiFileReader.getMidiFileFormat(java.io.InputStream)
     *      throws javax.sound.midi.InvalidMidiDataException,java.io.IOException (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getSequence(java.io.File) public abstract
     * javax.sound.midi.Sequence javax.sound.midi.spi.MidiFileReader.getSequence(java.io.File) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.spi.MidiFileReader#getSequence(java.io.File) public abstract javax.sound.midi.Sequence
     *      javax.sound.midi.spi.MidiFileReader.getSequence(java.io.File) throws
     *      javax.sound.midi.InvalidMidiDataException,java.io.IOException (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getSequence(java.net.URL) public abstract
     * javax.sound.midi.Sequence javax.sound.midi.spi.MidiFileReader.getSequence(java.net.URL) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.spi.MidiFileReader#getSequence(java.net.URL) public abstract javax.sound.midi.Sequence
     *      javax.sound.midi.spi.MidiFileReader.getSequence(java.net.URL) throws
     *      javax.sound.midi.InvalidMidiDataException,java.io.IOException (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.sound.midi.spi.MidiFileReader#getSequence(java.io.InputStream) public abstract
     * javax.sound.midi.Sequence javax.sound.midi.spi.MidiFileReader.getSequence(java.io.InputStream) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.spi.MidiFileReader#getSequence(java.io.InputStream) public abstract
     *      javax.sound.midi.Sequence javax.sound.midi.spi.MidiFileReader.getSequence(java.io.InputStream) throws
     *      javax.sound.midi.InvalidMidiDataException,java.io.IOException (the hereby targeted method-under-test)
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

package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.midi.spi.SoundbankReader class javax.sound.midi.spi.SoundbankReader}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.midi.spi.SoundbankReaderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SoundbankReaderTests<SUT extends javax.sound.midi.spi.SoundbankReader>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.SoundbankReader#getSoundbank(java.io.File) public abstract
     * javax.sound.midi.Soundbank javax.sound.midi.spi.SoundbankReader.getSoundbank(java.io.File) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSoundbank_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.SoundbankReader#getSoundbank(java.io.InputStream) public abstract
     * javax.sound.midi.Soundbank javax.sound.midi.spi.SoundbankReader.getSoundbank(java.io.InputStream) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSoundbank_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.SoundbankReader#getSoundbank(java.net.URL) public abstract
     * javax.sound.midi.Soundbank javax.sound.midi.spi.SoundbankReader.getSoundbank(java.net.URL) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSoundbank_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

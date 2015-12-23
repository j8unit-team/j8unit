package org.j8unit.repository.javax.sound.midi.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.midi.spi.SoundbankReader class
 * javax.sound.midi.spi.SoundbankReader}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.midi.spi.SoundbankReaderTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.midi.spi.SoundbankReaderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.midi.spi.SoundbankReader
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SoundbankReaderTests<SUT extends javax.sound.midi.spi.SoundbankReader>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.spi.SoundbankReader#getSoundbank(java.io.File) public abstract
     * javax.sound.midi.Soundbank javax.sound.midi.spi.SoundbankReader.getSoundbank(java.io.File) throws
     * javax.sound.midi.InvalidMidiDataException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.midi.spi.SoundbankReader#getSoundbank(java.io.File)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.midi.spi.SoundbankReader#getSoundbank(java.io.InputStream)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.midi.spi.SoundbankReader#getSoundbank(java.net.URL)
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

package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.sampled.spi.AudioFileReader class
 * javax.sound.sampled.spi.AudioFileReader}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.sampled.spi.AudioFileReaderTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.sampled.spi.AudioFileReaderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.sampled.spi.AudioFileReader
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AudioFileReaderTests<SUT extends javax.sound.sampled.spi.AudioFileReader>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileReader#getAudioFileFormat(java.io.File) public abstract
     * javax.sound.sampled.AudioFileFormat javax.sound.sampled.spi.AudioFileReader.getAudioFileFormat(java.io.File)
     * throws javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileReader#getAudioFileFormat(java.io.File)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileFormat_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileReader#getAudioFileFormat(java.io.InputStream) public
     * abstract javax.sound.sampled.AudioFileFormat
     * javax.sound.sampled.spi.AudioFileReader.getAudioFileFormat(java.io.InputStream) throws
     * javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileReader#getAudioFileFormat(java.io.InputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileFormat_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileReader#getAudioFileFormat(java.net.URL) public abstract
     * javax.sound.sampled.AudioFileFormat javax.sound.sampled.spi.AudioFileReader.getAudioFileFormat(java.net.URL)
     * throws javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileReader#getAudioFileFormat(java.net.URL)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileFormat_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileReader#getAudioInputStream(java.io.File) public abstract
     * javax.sound.sampled.AudioInputStream javax.sound.sampled.spi.AudioFileReader.getAudioInputStream(java.io.File)
     * throws javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileReader#getAudioInputStream(java.io.File)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioInputStream_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileReader#getAudioInputStream(java.io.InputStream) public
     * abstract javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.spi.AudioFileReader.getAudioInputStream(java.io.InputStream) throws
     * javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileReader#getAudioInputStream(java.io.InputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioInputStream_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileReader#getAudioInputStream(java.net.URL) public abstract
     * javax.sound.sampled.AudioInputStream javax.sound.sampled.spi.AudioFileReader.getAudioInputStream(java.net.URL)
     * throws javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileReader#getAudioInputStream(java.net.URL)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioInputStream_URL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

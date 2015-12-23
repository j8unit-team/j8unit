package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.sampled.spi.AudioFileWriter class
 * javax.sound.sampled.spi.AudioFileWriter}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.sampled.spi.AudioFileWriterTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.sampled.spi.AudioFileWriterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.sampled.spi.AudioFileWriter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AudioFileWriterTests<SUT extends javax.sound.sampled.spi.AudioFileWriter>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes() public abstract
     * javax.sound.sampled.AudioFileFormat$Type[] javax.sound.sampled.spi.AudioFileWriter.getAudioFileTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes(javax.sound.sampled.AudioInputStream) public
     * abstract javax.sound.sampled.AudioFileFormat$Type[]
     * javax.sound.sampled.spi.AudioFileWriter.getAudioFileTypes(javax.sound.sampled.AudioInputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes(javax.sound.sampled.AudioInputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileTypes_AudioInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.AudioFileWriter#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type)
     * public boolean
     * javax.sound.sampled.spi.AudioFileWriter.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileWriter#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFileTypeSupported_Type()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.AudioFileWriter#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type, javax.sound.sampled.AudioInputStream)
     * public boolean
     * javax.sound.sampled.spi.AudioFileWriter.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type,javax.sound.sampled.AudioInputStream)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileWriter#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type,
     *             javax.sound.sampled.AudioInputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFileTypeSupported_Type_AudioInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.AudioFileWriter#write(javax.sound.sampled.AudioInputStream, javax.sound.sampled.AudioFileFormat.Type, java.io.File)
     * public abstract int
     * javax.sound.sampled.spi.AudioFileWriter.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat$Type,java.io.File)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileWriter#write(javax.sound.sampled.AudioInputStream,
     *             javax.sound.sampled.AudioFileFormat.Type, java.io.File)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_AudioInputStream_Type_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.AudioFileWriter#write(javax.sound.sampled.AudioInputStream, javax.sound.sampled.AudioFileFormat.Type, java.io.OutputStream)
     * public abstract int
     * javax.sound.sampled.spi.AudioFileWriter.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat$Type,java.io.OutputStream)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.AudioFileWriter#write(javax.sound.sampled.AudioInputStream,
     *             javax.sound.sampled.AudioFileFormat.Type, java.io.OutputStream)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_AudioInputStream_Type_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

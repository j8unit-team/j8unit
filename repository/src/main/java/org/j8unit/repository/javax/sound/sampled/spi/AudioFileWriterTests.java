package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.spi.AudioFileWriter class
 * javax.sound.sampled.spi.AudioFileWriter}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AudioFileWriterClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.spi.AudioFileWriter class javax.sound.sampled.spi.AudioFileWriter (the hereby targeted
 *      class-under-test class)
 * @see AudioFileWriterClassTests AudioFileWriterClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AudioFileWriterTests<SUT extends javax.sound.sampled.spi.AudioFileWriter>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes(javax.sound.sampled.AudioInputStream) public
     * abstract javax.sound.sampled.AudioFileFormat$Type[]
     * javax.sound.sampled.spi.AudioFileWriter.getAudioFileTypes(javax.sound.sampled.AudioInputStream)}.
     *
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
     * @see javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes(javax.sound.sampled.AudioInputStream) public
     *      abstract javax.sound.sampled.AudioFileFormat$Type[]
     *      javax.sound.sampled.spi.AudioFileWriter.getAudioFileTypes(javax.sound.sampled.AudioInputStream) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes() public abstract
     * javax.sound.sampled.AudioFileFormat$Type[] javax.sound.sampled.spi.AudioFileWriter.getAudioFileTypes()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes() public abstract
     * javax.sound.sampled.AudioFileFormat$Type[] javax.sound.sampled.spi.AudioFileWriter.getAudioFileTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes() public abstract
     *      javax.sound.sampled.AudioFileFormat$Type[] javax.sound.sampled.spi.AudioFileWriter.getAudioFileTypes() (the
     *      hereby targeted method-under-test)
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
     * {@link javax.sound.sampled.spi.AudioFileWriter#write(javax.sound.sampled.AudioInputStream, javax.sound.sampled.AudioFileFormat.Type, java.io.OutputStream)
     * public abstract int
     * javax.sound.sampled.spi.AudioFileWriter.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat$Type,java.io.OutputStream)
     * throws java.io.IOException}.
     *
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
     * @see javax.sound.sampled.spi.AudioFileWriter#write(javax.sound.sampled.AudioInputStream,
     *      javax.sound.sampled.AudioFileFormat.Type, java.io.OutputStream) public abstract int
     *      javax.sound.sampled.spi.AudioFileWriter.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.
     *      AudioFileFormat$Type,java.io.OutputStream) throws java.io.IOException (the hereby targeted
     *      method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.AudioFileWriter#write(javax.sound.sampled.AudioInputStream, javax.sound.sampled.AudioFileFormat.Type, java.io.File)
     * public abstract int
     * javax.sound.sampled.spi.AudioFileWriter.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat$Type,java.io.File)
     * throws java.io.IOException}.
     *
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
     * @see javax.sound.sampled.spi.AudioFileWriter#write(javax.sound.sampled.AudioInputStream,
     *      javax.sound.sampled.AudioFileFormat.Type, java.io.File) public abstract int
     *      javax.sound.sampled.spi.AudioFileWriter.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.
     *      AudioFileFormat$Type,java.io.File) throws java.io.IOException (the hereby targeted method-under-test)
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
     * {@link javax.sound.sampled.spi.AudioFileWriter#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type)
     * public boolean
     * javax.sound.sampled.spi.AudioFileWriter.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type)}.
     *
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
     * @see javax.sound.sampled.spi.AudioFileWriter#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type) public
     *      boolean
     *      javax.sound.sampled.spi.AudioFileWriter.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type) (the
     *      hereby targeted method-under-test)
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
     * @see javax.sound.sampled.spi.AudioFileWriter#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type,
     *      javax.sound.sampled.AudioInputStream) public boolean
     *      javax.sound.sampled.spi.AudioFileWriter.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type,javax.
     *      sound.sampled.AudioInputStream) (the hereby targeted method-under-test)
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

}

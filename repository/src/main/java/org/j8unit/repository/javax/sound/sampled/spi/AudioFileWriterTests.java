package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sound.sampled.spi.AudioFileWriter class javax.sound.sampled.spi.AudioFileWriter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.sampled.spi.AudioFileWriterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AudioFileWriterTests<SUT extends javax.sound.sampled.spi.AudioFileWriter>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes(javax.sound.sampled.AudioInputStream) public abstract javax.sound.sampled.AudioFileFormat$Type[] javax.sound.sampled.spi.AudioFileWriter.getAudioFileTypes(javax.sound.sampled.AudioInputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileTypes_AudioInputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileWriter#getAudioFileTypes() public abstract javax.sound.sampled.AudioFileFormat$Type[] javax.sound.sampled.spi.AudioFileWriter.getAudioFileTypes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileTypes() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileWriter#write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat.Type,java.io.OutputStream) public abstract int javax.sound.sampled.spi.AudioFileWriter.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat$Type,java.io.OutputStream) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_AudioInputStream_Type_OutputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileWriter#write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat.Type,java.io.File) public abstract int javax.sound.sampled.spi.AudioFileWriter.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat$Type,java.io.File) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_AudioInputStream_Type_File() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileWriter#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type) public boolean javax.sound.sampled.spi.AudioFileWriter.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFileTypeSupported_Type() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.AudioFileWriter#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type,javax.sound.sampled.AudioInputStream) public boolean javax.sound.sampled.spi.AudioFileWriter.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type,javax.sound.sampled.AudioInputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFileTypeSupported_Type_AudioInputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

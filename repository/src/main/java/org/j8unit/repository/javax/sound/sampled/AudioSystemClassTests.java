package org.j8unit.repository.javax.sound.sampled;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.sampled.AudioSystem class javax.sound.sampled.AudioSystem}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.sound.sampled.AudioSystemTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.sampled.AudioSystemTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AudioSystemClassTests<SUT extends javax.sound.sampled.AudioSystem>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getAudioFileFormat(java.io.File) public static
     * javax.sound.sampled.AudioFileFormat javax.sound.sampled.AudioSystem.getAudioFileFormat(java.io.File) throws
     * javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileFormat_File()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getAudioFileFormat(java.io.InputStream) public static
     * javax.sound.sampled.AudioFileFormat javax.sound.sampled.AudioSystem.getAudioFileFormat(java.io.InputStream)
     * throws javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileFormat_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getAudioFileFormat(java.net.URL) public static
     * javax.sound.sampled.AudioFileFormat javax.sound.sampled.AudioSystem.getAudioFileFormat(java.net.URL) throws
     * javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileFormat_URL()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getAudioFileTypes() public static
     * javax.sound.sampled.AudioFileFormat$Type[] javax.sound.sampled.AudioSystem.getAudioFileTypes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileTypes()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getAudioFileTypes(javax.sound.sampled.AudioInputStream)
     * public static javax.sound.sampled.AudioFileFormat$Type[]
     * javax.sound.sampled.AudioSystem.getAudioFileTypes(javax.sound.sampled.AudioInputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioFileTypes_AudioInputStream()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#getAudioInputStream(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioInputStream)
     * public static javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.AudioSystem.getAudioInputStream(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioInputStream)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioInputStream_AudioFormat_AudioInputStream()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#getAudioInputStream(javax.sound.sampled.AudioFormat.Encoding,javax.sound.sampled.AudioInputStream)
     * public static javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.AudioSystem.getAudioInputStream(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioInputStream)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioInputStream_Encoding_AudioInputStream()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getAudioInputStream(java.io.File) public static
     * javax.sound.sampled.AudioInputStream javax.sound.sampled.AudioSystem.getAudioInputStream(java.io.File) throws
     * javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioInputStream_File()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getAudioInputStream(java.io.InputStream) public static
     * javax.sound.sampled.AudioInputStream javax.sound.sampled.AudioSystem.getAudioInputStream(java.io.InputStream)
     * throws javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioInputStream_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getAudioInputStream(java.net.URL) public static
     * javax.sound.sampled.AudioInputStream javax.sound.sampled.AudioSystem.getAudioInputStream(java.net.URL) throws
     * javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioInputStream_URL()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getClip() public static javax.sound.sampled.Clip
     * javax.sound.sampled.AudioSystem.getClip() throws javax.sound.sampled.LineUnavailableException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClip()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getClip(javax.sound.sampled.Mixer.Info) public static
     * javax.sound.sampled.Clip javax.sound.sampled.AudioSystem.getClip(javax.sound.sampled.Mixer$Info) throws
     * javax.sound.sampled.LineUnavailableException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClip_Info()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getLine(javax.sound.sampled.Line.Info) public static
     * javax.sound.sampled.Line javax.sound.sampled.AudioSystem.getLine(javax.sound.sampled.Line$Info) throws
     * javax.sound.sampled.LineUnavailableException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLine_Info()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getMixer(javax.sound.sampled.Mixer.Info) public static
     * javax.sound.sampled.Mixer javax.sound.sampled.AudioSystem.getMixer(javax.sound.sampled.Mixer$Info)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMixer_Info()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getMixerInfo() public static
     * javax.sound.sampled.Mixer$Info[] javax.sound.sampled.AudioSystem.getMixerInfo()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMixerInfo()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getSourceDataLine(javax.sound.sampled.AudioFormat) public
     * static javax.sound.sampled.SourceDataLine
     * javax.sound.sampled.AudioSystem.getSourceDataLine(javax.sound.sampled.AudioFormat) throws
     * javax.sound.sampled.LineUnavailableException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSourceDataLine_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#getSourceDataLine(javax.sound.sampled.AudioFormat,javax.sound.sampled.Mixer.Info)
     * public static javax.sound.sampled.SourceDataLine
     * javax.sound.sampled.AudioSystem.getSourceDataLine(javax.sound.sampled.AudioFormat,javax.sound.sampled.Mixer$Info)
     * throws javax.sound.sampled.LineUnavailableException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSourceDataLine_AudioFormat_Info()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getSourceLineInfo(javax.sound.sampled.Line.Info) public
     * static javax.sound.sampled.Line$Info[]
     * javax.sound.sampled.AudioSystem.getSourceLineInfo(javax.sound.sampled.Line$Info)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSourceLineInfo_Info()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getTargetDataLine(javax.sound.sampled.AudioFormat) public
     * static javax.sound.sampled.TargetDataLine
     * javax.sound.sampled.AudioSystem.getTargetDataLine(javax.sound.sampled.AudioFormat) throws
     * javax.sound.sampled.LineUnavailableException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetDataLine_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#getTargetDataLine(javax.sound.sampled.AudioFormat,javax.sound.sampled.Mixer.Info)
     * public static javax.sound.sampled.TargetDataLine
     * javax.sound.sampled.AudioSystem.getTargetDataLine(javax.sound.sampled.AudioFormat,javax.sound.sampled.Mixer$Info)
     * throws javax.sound.sampled.LineUnavailableException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetDataLine_AudioFormat_Info()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getTargetEncodings(javax.sound.sampled.AudioFormat) public
     * static javax.sound.sampled.AudioFormat$Encoding[]
     * javax.sound.sampled.AudioSystem.getTargetEncodings(javax.sound.sampled.AudioFormat)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetEncodings_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#getTargetEncodings(javax.sound.sampled.AudioFormat.Encoding) public static
     * javax.sound.sampled.AudioFormat$Encoding[]
     * javax.sound.sampled.AudioSystem.getTargetEncodings(javax.sound.sampled.AudioFormat$Encoding)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetEncodings_Encoding()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#getTargetFormats(javax.sound.sampled.AudioFormat.Encoding,javax.sound.sampled.AudioFormat)
     * public static javax.sound.sampled.AudioFormat[]
     * javax.sound.sampled.AudioSystem.getTargetFormats(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioFormat)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetFormats_Encoding_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#getTargetLineInfo(javax.sound.sampled.Line.Info) public
     * static javax.sound.sampled.Line$Info[]
     * javax.sound.sampled.AudioSystem.getTargetLineInfo(javax.sound.sampled.Line$Info)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetLineInfo_Info()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#isConversionSupported(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioFormat)
     * public static boolean
     * javax.sound.sampled.AudioSystem.isConversionSupported(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioFormat)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isConversionSupported_AudioFormat_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#isConversionSupported(javax.sound.sampled.AudioFormat.Encoding,javax.sound.sampled.AudioFormat)
     * public static boolean
     * javax.sound.sampled.AudioSystem.isConversionSupported(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioFormat)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isConversionSupported_Encoding_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type) public
     * static boolean javax.sound.sampled.AudioSystem.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFileTypeSupported_Type()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type,javax.sound.sampled.AudioInputStream)
     * public static boolean
     * javax.sound.sampled.AudioSystem.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type,javax.sound.sampled.AudioInputStream)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFileTypeSupported_Type_AudioInputStream()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.AudioSystem#isLineSupported(javax.sound.sampled.Line.Info) public
     * static boolean javax.sound.sampled.AudioSystem.isLineSupported(javax.sound.sampled.Line$Info)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isLineSupported_Info()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat.Type,java.io.File)
     * public static int
     * javax.sound.sampled.AudioSystem.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat$Type,java.io.File)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_AudioInputStream_Type_File()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.AudioSystem#write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat.Type,java.io.OutputStream)
     * public static int
     * javax.sound.sampled.AudioSystem.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat$Type,java.io.OutputStream)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_AudioInputStream_Type_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.sound.sampled.AudioSystem.class.isAssignableFrom(sut));
    }

}

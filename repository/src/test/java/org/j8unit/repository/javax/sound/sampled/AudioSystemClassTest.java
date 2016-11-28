package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.AudioSystem;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AudioSystem} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.AudioSystemClassTests}).
 */
@RunWith(J8Unit4.class)
public class AudioSystemClassTest
implements AudioSystemClassTests<AudioSystem> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.AudioSystem]

    @Override
    public Class<AudioSystem> createNewSUT() {
        return AudioSystem.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getTargetEncodings(javax.sound.sampled.AudioFormat.Encoding) public static
     * javax.sound.sampled.AudioFormat$Encoding[]
     * javax.sound.sampled.AudioSystem.getTargetEncodings(javax.sound.sampled.AudioFormat$Encoding)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getTargetEncodings_Encoding()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#getTargetEncodings(javax.sound.sampled.AudioFormat.Encoding)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getTargetEncodings(javax.sound.sampled.AudioFormat) public static
     * javax.sound.sampled.AudioFormat$Encoding[]
     * javax.sound.sampled.AudioSystem.getTargetEncodings(javax.sound.sampled.AudioFormat)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getTargetEncodings_AudioFormat()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#getTargetEncodings(javax.sound.sampled.AudioFormat)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getClip(javax.sound.sampled.Mixer.Info) public static
     * javax.sound.sampled.Clip javax.sound.sampled.AudioSystem.getClip(javax.sound.sampled.Mixer$Info) throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getClip_Info()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getClip(javax.sound.sampled.Mixer.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.sound.sampled.AudioSystem#getClip() public
     * static javax.sound.sampled.Clip javax.sound.sampled.AudioSystem.getClip() throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getClip()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getClip()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.sound.sampled.AudioSystem#getMixerInfo()
     * public static javax.sound.sampled.Mixer$Info[] javax.sound.sampled.AudioSystem.getMixerInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getMixerInfo()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getMixerInfo()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#isLineSupported(javax.sound.sampled.Line.Info) public static boolean
     * javax.sound.sampled.AudioSystem.isLineSupported(javax.sound.sampled.Line$Info)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isLineSupported_Info()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#isLineSupported(javax.sound.sampled.Line.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getTargetDataLine(javax.sound.sampled.AudioFormat) public static
     * javax.sound.sampled.TargetDataLine
     * javax.sound.sampled.AudioSystem.getTargetDataLine(javax.sound.sampled.AudioFormat) throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getTargetDataLine_AudioFormat()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#getTargetDataLine(javax.sound.sampled.AudioFormat)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getTargetDataLine(javax.sound.sampled.AudioFormat, javax.sound.sampled.Mixer.Info)
     * public static javax.sound.sampled.TargetDataLine
     * javax.sound.sampled.AudioSystem.getTargetDataLine(javax.sound.sampled.AudioFormat,javax.sound.sampled.Mixer$Info)
     * throws javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getTargetDataLine_AudioFormat_Info()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getTargetDataLine(javax.sound.sampled.AudioFormat,
        // javax.sound.sampled.Mixer.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type, javax.sound.sampled.AudioInputStream)
     * public static boolean
     * javax.sound.sampled.AudioSystem.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type,javax.sound.sampled.AudioInputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isFileTypeSupported_Type_AudioInputStream()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type,
        // javax.sound.sampled.AudioInputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type) public
     * static boolean javax.sound.sampled.AudioSystem.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isFileTypeSupported_Type()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#isFileTypeSupported(javax.sound.sampled.AudioFileFormat.Type)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.sound.sampled.AudioSystem#getAudioFileTypes()
     * public static javax.sound.sampled.AudioFileFormat$Type[] javax.sound.sampled.AudioSystem.getAudioFileTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAudioFileTypes()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getAudioFileTypes()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getAudioFileTypes(javax.sound.sampled.AudioInputStream) public static
     * javax.sound.sampled.AudioFileFormat$Type[]
     * javax.sound.sampled.AudioSystem.getAudioFileTypes(javax.sound.sampled.AudioInputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAudioFileTypes_AudioInputStream()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#getAudioFileTypes(javax.sound.sampled.AudioInputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getTargetLineInfo(javax.sound.sampled.Line.Info) public static
     * javax.sound.sampled.Line$Info[]
     * javax.sound.sampled.AudioSystem.getTargetLineInfo(javax.sound.sampled.Line$Info)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getTargetLineInfo_Info()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getTargetLineInfo(javax.sound.sampled.Line.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getLine(javax.sound.sampled.Line.Info) public static
     * javax.sound.sampled.Line javax.sound.sampled.AudioSystem.getLine(javax.sound.sampled.Line$Info) throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getLine_Info()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getLine(javax.sound.sampled.Line.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#isConversionSupported(javax.sound.sampled.AudioFormat, javax.sound.sampled.AudioFormat)
     * public static boolean
     * javax.sound.sampled.AudioSystem.isConversionSupported(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioFormat)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isConversionSupported_AudioFormat_AudioFormat()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#isConversionSupported(javax.sound.sampled.AudioFormat,
        // javax.sound.sampled.AudioFormat)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#isConversionSupported(javax.sound.sampled.AudioFormat.Encoding, javax.sound.sampled.AudioFormat)
     * public static boolean
     * javax.sound.sampled.AudioSystem.isConversionSupported(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioFormat)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_isConversionSupported_Encoding_AudioFormat()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#isConversionSupported(javax.sound.sampled.AudioFormat.Encoding,
        // javax.sound.sampled.AudioFormat)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#write(javax.sound.sampled.AudioInputStream, javax.sound.sampled.AudioFileFormat.Type, java.io.OutputStream)
     * public static int
     * javax.sound.sampled.AudioSystem.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat$Type,java.io.OutputStream)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_write_AudioInputStream_Type_OutputStream()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#write(javax.sound.sampled.AudioInputStream,
        // javax.sound.sampled.AudioFileFormat.Type, java.io.OutputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#write(javax.sound.sampled.AudioInputStream, javax.sound.sampled.AudioFileFormat.Type, java.io.File)
     * public static int
     * javax.sound.sampled.AudioSystem.write(javax.sound.sampled.AudioInputStream,javax.sound.sampled.AudioFileFormat$Type,java.io.File)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_write_AudioInputStream_Type_File()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#write(javax.sound.sampled.AudioInputStream,
        // javax.sound.sampled.AudioFileFormat.Type, java.io.File)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getMixer(javax.sound.sampled.Mixer.Info) public static
     * javax.sound.sampled.Mixer javax.sound.sampled.AudioSystem.getMixer(javax.sound.sampled.Mixer$Info)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getMixer_Info()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getMixer(javax.sound.sampled.Mixer.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getSourceDataLine(javax.sound.sampled.AudioFormat, javax.sound.sampled.Mixer.Info)
     * public static javax.sound.sampled.SourceDataLine
     * javax.sound.sampled.AudioSystem.getSourceDataLine(javax.sound.sampled.AudioFormat,javax.sound.sampled.Mixer$Info)
     * throws javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getSourceDataLine_AudioFormat_Info()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getSourceDataLine(javax.sound.sampled.AudioFormat,
        // javax.sound.sampled.Mixer.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getSourceDataLine(javax.sound.sampled.AudioFormat) public static
     * javax.sound.sampled.SourceDataLine
     * javax.sound.sampled.AudioSystem.getSourceDataLine(javax.sound.sampled.AudioFormat) throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getSourceDataLine_AudioFormat()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#getSourceDataLine(javax.sound.sampled.AudioFormat)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getSourceLineInfo(javax.sound.sampled.Line.Info) public static
     * javax.sound.sampled.Line$Info[]
     * javax.sound.sampled.AudioSystem.getSourceLineInfo(javax.sound.sampled.Line$Info)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getSourceLineInfo_Info()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getSourceLineInfo(javax.sound.sampled.Line.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getAudioInputStream(javax.sound.sampled.AudioFormat, javax.sound.sampled.AudioInputStream)
     * public static javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.AudioSystem.getAudioInputStream(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioInputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAudioInputStream_AudioFormat_AudioInputStream()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#getAudioInputStream(javax.sound.sampled.AudioFormat,
        // javax.sound.sampled.AudioInputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getAudioInputStream(java.net.URL) public static
     * javax.sound.sampled.AudioInputStream javax.sound.sampled.AudioSystem.getAudioInputStream(java.net.URL) throws
     * javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAudioInputStream_URL()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getAudioInputStream(java.net.URL)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getAudioInputStream(java.io.InputStream) public static
     * javax.sound.sampled.AudioInputStream javax.sound.sampled.AudioSystem.getAudioInputStream(java.io.InputStream)
     * throws javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAudioInputStream_InputStream()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getAudioInputStream(java.io.InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getAudioInputStream(javax.sound.sampled.AudioFormat.Encoding, javax.sound.sampled.AudioInputStream)
     * public static javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.AudioSystem.getAudioInputStream(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioInputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAudioInputStream_Encoding_AudioInputStream()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#getAudioInputStream(javax.sound.sampled.AudioFormat.Encoding,
        // javax.sound.sampled.AudioInputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getAudioInputStream(java.io.File) public static
     * javax.sound.sampled.AudioInputStream javax.sound.sampled.AudioSystem.getAudioInputStream(java.io.File) throws
     * javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAudioInputStream_File()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getAudioInputStream(java.io.File)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getAudioFileFormat(java.io.File) public static
     * javax.sound.sampled.AudioFileFormat javax.sound.sampled.AudioSystem.getAudioFileFormat(java.io.File) throws
     * javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAudioFileFormat_File()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getAudioFileFormat(java.io.File)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getAudioFileFormat(java.net.URL) public static
     * javax.sound.sampled.AudioFileFormat javax.sound.sampled.AudioSystem.getAudioFileFormat(java.net.URL) throws
     * javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAudioFileFormat_URL()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getAudioFileFormat(java.net.URL)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getAudioFileFormat(java.io.InputStream) public static
     * javax.sound.sampled.AudioFileFormat javax.sound.sampled.AudioSystem.getAudioFileFormat(java.io.InputStream)
     * throws javax.sound.sampled.UnsupportedAudioFileException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAudioFileFormat_InputStream()
    throws Exception {
        // write some test for {@link javax.sound.sampled.AudioSystem#getAudioFileFormat(java.io.InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.sound.sampled.AudioSystem#getTargetFormats(javax.sound.sampled.AudioFormat.Encoding, javax.sound.sampled.AudioFormat)
     * public static javax.sound.sampled.AudioFormat[]
     * javax.sound.sampled.AudioSystem.getTargetFormats(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioFormat)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getTargetFormats_Encoding_AudioFormat()
    throws Exception {
        // write some test for {@link
        // javax.sound.sampled.AudioSystem#getTargetFormats(javax.sound.sampled.AudioFormat.Encoding,
        // javax.sound.sampled.AudioFormat)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.AudioSystem]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.AudioSystem]

}

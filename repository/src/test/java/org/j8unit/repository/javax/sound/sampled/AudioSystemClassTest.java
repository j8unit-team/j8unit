package org.j8unit.repository.javax.sound.sampled;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer.Info;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioSystemClassTest
implements org.j8unit.repository.javax.sound.sampled.AudioSystemClassTests<AudioSystem> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.AudioSystem]

    @Override
    public Class<AudioSystem> createNewSUT() {
        return AudioSystem.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getTargetEncodings(AudioFormat) public
     * static javax.sound.sampled.AudioFormat$Encoding[]
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
        // write some test for {@link AudioSystem#getTargetEncodings(AudioFormat)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getTargetEncodings(Encoding) public
     * static javax.sound.sampled.AudioFormat$Encoding[]
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
        // write some test for {@link AudioSystem#getTargetEncodings(Encoding)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getClip() public static
     * javax.sound.sampled.Clip javax.sound.sampled.AudioSystem.getClip() throws
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
        // write some test for {@link AudioSystem#getClip()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getClip(Info) public static
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
        // write some test for {@link AudioSystem#getClip(Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getMixerInfo() public static
     * javax.sound.sampled.Mixer$Info[] javax.sound.sampled.AudioSystem.getMixerInfo()}.
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
        // write some test for {@link AudioSystem#getMixerInfo()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link AudioSystem#isLineSupported(javax.sound.sampled.Line.Info) public static boolean
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
        // write some test for {@link AudioSystem#isLineSupported(javax.sound.sampled.Line.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getTargetDataLine(AudioFormat) public
     * static javax.sound.sampled.TargetDataLine
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
        // write some test for {@link AudioSystem#getTargetDataLine(AudioFormat)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getTargetDataLine(AudioFormat, Info)
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
        // write some test for {@link AudioSystem#getTargetDataLine(AudioFormat, Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#isFileTypeSupported(Type) public static
     * boolean javax.sound.sampled.AudioSystem.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type)}.
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
        // write some test for {@link AudioSystem#isFileTypeSupported(Type)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link AudioSystem#isFileTypeSupported(Type, AudioInputStream) public static boolean
     * javax.sound.sampled.AudioSystem.isFileTypeSupported(javax.sound.sampled.AudioFileFormat$Type,javax.sound.sampled.AudioInputStream)}
     * .
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
        // write some test for {@link AudioSystem#isFileTypeSupported(Type, AudioInputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getAudioFileTypes(AudioInputStream)
     * public static javax.sound.sampled.AudioFileFormat$Type[]
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
        // write some test for {@link AudioSystem#getAudioFileTypes(AudioInputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getAudioFileTypes() public static
     * javax.sound.sampled.AudioFileFormat$Type[] javax.sound.sampled.AudioSystem.getAudioFileTypes()}.
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
        // write some test for {@link AudioSystem#getAudioFileTypes()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link AudioSystem#getTargetLineInfo(javax.sound.sampled.Line.Info) public static javax.sound.sampled.Line$Info[]
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
        // write some test for {@link AudioSystem#getTargetLineInfo(javax.sound.sampled.Line.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getLine(javax.sound.sampled.Line.Info)
     * public static javax.sound.sampled.Line javax.sound.sampled.AudioSystem.getLine(javax.sound.sampled.Line$Info)
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
    public void test_getLine_Info()
    throws Exception {
        // write some test for {@link AudioSystem#getLine(javax.sound.sampled.Line.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link AudioSystem#isConversionSupported(AudioFormat, AudioFormat) public static boolean
     * javax.sound.sampled.AudioSystem.isConversionSupported(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioFormat)}
     * .
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
        // write some test for {@link AudioSystem#isConversionSupported(AudioFormat, AudioFormat)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link AudioSystem#isConversionSupported(Encoding, AudioFormat) public static boolean
     * javax.sound.sampled.AudioSystem.isConversionSupported(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioFormat)}
     * .
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
        // write some test for {@link AudioSystem#isConversionSupported(Encoding, AudioFormat)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link AudioSystem#write(AudioInputStream, Type, OutputStream) public static int
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
        // write some test for {@link AudioSystem#write(AudioInputStream, Type, OutputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#write(AudioInputStream, Type, File)
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
        // write some test for {@link AudioSystem#write(AudioInputStream, Type, File)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getMixer(Info) public static
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
        // write some test for {@link AudioSystem#getMixer(Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getSourceDataLine(AudioFormat, Info)
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
        // write some test for {@link AudioSystem#getSourceDataLine(AudioFormat, Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getSourceDataLine(AudioFormat) public
     * static javax.sound.sampled.SourceDataLine
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
        // write some test for {@link AudioSystem#getSourceDataLine(AudioFormat)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link AudioSystem#getSourceLineInfo(javax.sound.sampled.Line.Info) public static javax.sound.sampled.Line$Info[]
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
        // write some test for {@link AudioSystem#getSourceLineInfo(javax.sound.sampled.Line.Info)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getAudioInputStream(URL) public static
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
        // write some test for {@link AudioSystem#getAudioInputStream(URL)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getAudioInputStream(InputStream) public
     * static javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.AudioSystem.getAudioInputStream(java.io.InputStream) throws
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
    public void test_getAudioInputStream_InputStream()
    throws Exception {
        // write some test for {@link AudioSystem#getAudioInputStream(InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getAudioInputStream(File) public static
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
        // write some test for {@link AudioSystem#getAudioInputStream(File)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link AudioSystem#getAudioInputStream(AudioFormat, AudioInputStream) public static
     * javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.AudioSystem.getAudioInputStream(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioInputStream)}
     * .
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
        // write some test for {@link AudioSystem#getAudioInputStream(AudioFormat, AudioInputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link AudioSystem#getAudioInputStream(Encoding, AudioInputStream) public static
     * javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.AudioSystem.getAudioInputStream(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioInputStream)}
     * .
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
        // write some test for {@link AudioSystem#getAudioInputStream(Encoding, AudioInputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getAudioFileFormat(InputStream) public
     * static javax.sound.sampled.AudioFileFormat
     * javax.sound.sampled.AudioSystem.getAudioFileFormat(java.io.InputStream) throws
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
    public void test_getAudioFileFormat_InputStream()
    throws Exception {
        // write some test for {@link AudioSystem#getAudioFileFormat(InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getAudioFileFormat(URL) public static
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
        // write some test for {@link AudioSystem#getAudioFileFormat(URL)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getAudioFileFormat(File) public static
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
        // write some test for {@link AudioSystem#getAudioFileFormat(File)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link AudioSystem#getTargetFormats(Encoding, AudioFormat)
     * public static javax.sound.sampled.AudioFormat[]
     * javax.sound.sampled.AudioSystem.getTargetFormats(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioFormat)}
     * .
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
        // write some test for {@link AudioSystem#getTargetFormats(Encoding, AudioFormat)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.AudioSystem]

}

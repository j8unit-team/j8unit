package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.spi.FormatConversionProvider class
 * javax.sound.sampled.spi.FormatConversionProvider}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link FormatConversionProviderClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.spi.FormatConversionProvider class javax.sound.sampled.spi.FormatConversionProvider (the
 *      hereby targeted class-under-test class)
 * @see FormatConversionProviderClassTests FormatConversionProviderClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormatConversionProviderTests<SUT extends javax.sound.sampled.spi.FormatConversionProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#getTargetEncodings(javax.sound.sampled.AudioFormat)
     * public abstract javax.sound.sampled.AudioFormat$Encoding[]
     * javax.sound.sampled.spi.FormatConversionProvider.getTargetEncodings(javax.sound.sampled.AudioFormat)}.
     *
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#getTargetEncodings(javax.sound.sampled.AudioFormat)
     * public abstract javax.sound.sampled.AudioFormat$Encoding[]
     * javax.sound.sampled.spi.FormatConversionProvider.getTargetEncodings(javax.sound.sampled.AudioFormat)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.FormatConversionProvider#getTargetEncodings(javax.sound.sampled.AudioFormat) public
     *      abstract javax.sound.sampled.AudioFormat$Encoding[]
     *      javax.sound.sampled.spi.FormatConversionProvider.getTargetEncodings(javax.sound.sampled.AudioFormat) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetEncodings_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.FormatConversionProvider#getTargetEncodings() public abstract
     * javax.sound.sampled.AudioFormat$Encoding[] javax.sound.sampled.spi.FormatConversionProvider.getTargetEncodings()}
     * .
     *
     * <p>
     * Test method for {@link javax.sound.sampled.spi.FormatConversionProvider#getTargetEncodings() public abstract
     * javax.sound.sampled.AudioFormat$Encoding[] javax.sound.sampled.spi.FormatConversionProvider.getTargetEncodings()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.FormatConversionProvider#getTargetEncodings() public abstract
     *      javax.sound.sampled.AudioFormat$Encoding[]
     *      javax.sound.sampled.spi.FormatConversionProvider.getTargetEncodings() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetEncodings()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#isTargetEncodingSupported(javax.sound.sampled.AudioFormat.Encoding)
     * public boolean
     * javax.sound.sampled.spi.FormatConversionProvider.isTargetEncodingSupported(javax.sound.sampled.AudioFormat$Encoding)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#isTargetEncodingSupported(javax.sound.sampled.AudioFormat.Encoding)
     * public boolean
     * javax.sound.sampled.spi.FormatConversionProvider.isTargetEncodingSupported(javax.sound.sampled.AudioFormat$Encoding)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.FormatConversionProvider#isTargetEncodingSupported(javax.sound.sampled.AudioFormat.Encoding)
     *      public boolean
     *      javax.sound.sampled.spi.FormatConversionProvider.isTargetEncodingSupported(javax.sound.sampled.
     *      AudioFormat$Encoding) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTargetEncodingSupported_Encoding()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#isSourceEncodingSupported(javax.sound.sampled.AudioFormat.Encoding)
     * public boolean
     * javax.sound.sampled.spi.FormatConversionProvider.isSourceEncodingSupported(javax.sound.sampled.AudioFormat$Encoding)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#isSourceEncodingSupported(javax.sound.sampled.AudioFormat.Encoding)
     * public boolean
     * javax.sound.sampled.spi.FormatConversionProvider.isSourceEncodingSupported(javax.sound.sampled.AudioFormat$Encoding)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.FormatConversionProvider#isSourceEncodingSupported(javax.sound.sampled.AudioFormat.Encoding)
     *      public boolean
     *      javax.sound.sampled.spi.FormatConversionProvider.isSourceEncodingSupported(javax.sound.sampled.
     *      AudioFormat$Encoding) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSourceEncodingSupported_Encoding()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#getAudioInputStream(javax.sound.sampled.AudioFormat.Encoding, javax.sound.sampled.AudioInputStream)
     * public abstract javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.spi.FormatConversionProvider.getAudioInputStream(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioInputStream)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#getAudioInputStream(javax.sound.sampled.AudioFormat.Encoding, javax.sound.sampled.AudioInputStream)
     * public abstract javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.spi.FormatConversionProvider.getAudioInputStream(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioInputStream)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.FormatConversionProvider#getAudioInputStream(javax.sound.sampled.AudioFormat.Encoding,
     *      javax.sound.sampled.AudioInputStream) public abstract javax.sound.sampled.AudioInputStream
     *      javax.sound.sampled.spi.FormatConversionProvider.getAudioInputStream(javax.sound.sampled.
     *      AudioFormat$Encoding,javax.sound.sampled.AudioInputStream) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioInputStream_Encoding_AudioInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#getAudioInputStream(javax.sound.sampled.AudioFormat, javax.sound.sampled.AudioInputStream)
     * public abstract javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.spi.FormatConversionProvider.getAudioInputStream(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioInputStream)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#getAudioInputStream(javax.sound.sampled.AudioFormat, javax.sound.sampled.AudioInputStream)
     * public abstract javax.sound.sampled.AudioInputStream
     * javax.sound.sampled.spi.FormatConversionProvider.getAudioInputStream(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioInputStream)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.FormatConversionProvider#getAudioInputStream(javax.sound.sampled.AudioFormat,
     *      javax.sound.sampled.AudioInputStream) public abstract javax.sound.sampled.AudioInputStream
     *      javax.sound.sampled.spi.FormatConversionProvider.getAudioInputStream(javax.sound.sampled.AudioFormat,javax.
     *      sound.sampled.AudioInputStream) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAudioInputStream_AudioFormat_AudioInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.FormatConversionProvider#getSourceEncodings() public abstract
     * javax.sound.sampled.AudioFormat$Encoding[] javax.sound.sampled.spi.FormatConversionProvider.getSourceEncodings()}
     * .
     *
     * <p>
     * Test method for {@link javax.sound.sampled.spi.FormatConversionProvider#getSourceEncodings() public abstract
     * javax.sound.sampled.AudioFormat$Encoding[] javax.sound.sampled.spi.FormatConversionProvider.getSourceEncodings()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.FormatConversionProvider#getSourceEncodings() public abstract
     *      javax.sound.sampled.AudioFormat$Encoding[]
     *      javax.sound.sampled.spi.FormatConversionProvider.getSourceEncodings() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSourceEncodings()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#getTargetFormats(javax.sound.sampled.AudioFormat.Encoding, javax.sound.sampled.AudioFormat)
     * public abstract javax.sound.sampled.AudioFormat[]
     * javax.sound.sampled.spi.FormatConversionProvider.getTargetFormats(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioFormat)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#getTargetFormats(javax.sound.sampled.AudioFormat.Encoding, javax.sound.sampled.AudioFormat)
     * public abstract javax.sound.sampled.AudioFormat[]
     * javax.sound.sampled.spi.FormatConversionProvider.getTargetFormats(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioFormat)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.FormatConversionProvider#getTargetFormats(javax.sound.sampled.AudioFormat.Encoding,
     *      javax.sound.sampled.AudioFormat) public abstract javax.sound.sampled.AudioFormat[]
     *      javax.sound.sampled.spi.FormatConversionProvider.getTargetFormats(javax.sound.sampled.AudioFormat$Encoding,
     *      javax.sound.sampled.AudioFormat) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetFormats_Encoding_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#isConversionSupported(javax.sound.sampled.AudioFormat, javax.sound.sampled.AudioFormat)
     * public boolean
     * javax.sound.sampled.spi.FormatConversionProvider.isConversionSupported(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioFormat)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#isConversionSupported(javax.sound.sampled.AudioFormat, javax.sound.sampled.AudioFormat)
     * public boolean
     * javax.sound.sampled.spi.FormatConversionProvider.isConversionSupported(javax.sound.sampled.AudioFormat,javax.sound.sampled.AudioFormat)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.FormatConversionProvider#isConversionSupported(javax.sound.sampled.AudioFormat,
     *      javax.sound.sampled.AudioFormat) public boolean
     *      javax.sound.sampled.spi.FormatConversionProvider.isConversionSupported(javax.sound.sampled.AudioFormat,javax
     *      .sound.sampled.AudioFormat) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isConversionSupported_AudioFormat_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#isConversionSupported(javax.sound.sampled.AudioFormat.Encoding, javax.sound.sampled.AudioFormat)
     * public boolean
     * javax.sound.sampled.spi.FormatConversionProvider.isConversionSupported(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioFormat)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.sound.sampled.spi.FormatConversionProvider#isConversionSupported(javax.sound.sampled.AudioFormat.Encoding, javax.sound.sampled.AudioFormat)
     * public boolean
     * javax.sound.sampled.spi.FormatConversionProvider.isConversionSupported(javax.sound.sampled.AudioFormat$Encoding,javax.sound.sampled.AudioFormat)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.spi.FormatConversionProvider#isConversionSupported(javax.sound.sampled.AudioFormat.Encoding,
     *      javax.sound.sampled.AudioFormat) public boolean
     *      javax.sound.sampled.spi.FormatConversionProvider.isConversionSupported(javax.sound.sampled.
     *      AudioFormat$Encoding,javax.sound.sampled.AudioFormat) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isConversionSupported_Encoding_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

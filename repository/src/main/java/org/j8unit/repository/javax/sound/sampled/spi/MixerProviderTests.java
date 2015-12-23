package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.sampled.spi.MixerProvider class
 * javax.sound.sampled.spi.MixerProvider}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.sampled.spi.MixerProviderTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.sampled.spi.MixerProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.sampled.spi.MixerProvider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MixerProviderTests<SUT extends javax.sound.sampled.spi.MixerProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.MixerProvider#getMixer(javax.sound.sampled.Mixer.Info) public
     * abstract javax.sound.sampled.Mixer
     * javax.sound.sampled.spi.MixerProvider.getMixer(javax.sound.sampled.Mixer$Info)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.MixerProvider#getMixer(javax.sound.sampled.Mixer.Info)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMixer_Info()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.MixerProvider#getMixerInfo() public abstract
     * javax.sound.sampled.Mixer$Info[] javax.sound.sampled.spi.MixerProvider.getMixerInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.MixerProvider#getMixerInfo()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMixerInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.MixerProvider#isMixerSupported(javax.sound.sampled.Mixer.Info)
     * public boolean javax.sound.sampled.spi.MixerProvider.isMixerSupported(javax.sound.sampled.Mixer$Info)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.spi.MixerProvider#isMixerSupported(javax.sound.sampled.Mixer.Info)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isMixerSupported_Info()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

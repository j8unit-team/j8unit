package org.j8unit.repository.javax.sound.sampled.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sound.sampled.spi.MixerProvider class javax.sound.sampled.spi.MixerProvider}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.sampled.spi.MixerProviderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MixerProviderTests<SUT extends javax.sound.sampled.spi.MixerProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.MixerProvider#getMixerInfo() public abstract
     * javax.sound.sampled.Mixer$Info[] javax.sound.sampled.spi.MixerProvider.getMixerInfo()}.
     * </p>
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
     * </p>
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

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.spi.MixerProvider#getMixer(javax.sound.sampled.Mixer.Info) public
     * abstract javax.sound.sampled.Mixer
     * javax.sound.sampled.spi.MixerProvider.getMixer(javax.sound.sampled.Mixer$Info)}.
     * </p>
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

}

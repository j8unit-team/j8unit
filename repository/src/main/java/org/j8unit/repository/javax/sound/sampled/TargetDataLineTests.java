package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.sampled.TargetDataLine interface
 * javax.sound.sampled.TargetDataLine}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.sampled.TargetDataLineTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.sampled.TargetDataLineClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.sampled.TargetDataLine
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TargetDataLineTests<SUT extends javax.sound.sampled.TargetDataLine>
extends org.j8unit.repository.javax.sound.sampled.DataLineTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.TargetDataLine#open(javax.sound.sampled.AudioFormat) public abstract
     * void javax.sound.sampled.TargetDataLine.open(javax.sound.sampled.AudioFormat) throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.TargetDataLine#open(javax.sound.sampled.AudioFormat)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open_AudioFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.TargetDataLine#open(javax.sound.sampled.AudioFormat, int) public
     * abstract void javax.sound.sampled.TargetDataLine.open(javax.sound.sampled.AudioFormat,int) throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.TargetDataLine#open(javax.sound.sampled.AudioFormat, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open_AudioFormat_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.TargetDataLine#read(byte[], int, int) public abstract int
     * javax.sound.sampled.TargetDataLine.read(byte[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.sampled.TargetDataLine#read(byte[], int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

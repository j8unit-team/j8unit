package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.SourceDataLine interface
 * javax.sound.sampled.SourceDataLine}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link SourceDataLineClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.SourceDataLine interface javax.sound.sampled.SourceDataLine (the hereby targeted
 *      class-under-test class)
 * @see SourceDataLineClassTests SourceDataLineClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SourceDataLineTests<SUT extends javax.sound.sampled.SourceDataLine>
extends DataLineTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.SourceDataLine#open(javax.sound.sampled.AudioFormat) public abstract
     * void javax.sound.sampled.SourceDataLine.open(javax.sound.sampled.AudioFormat) throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.SourceDataLine#open(javax.sound.sampled.AudioFormat) public abstract
     * void javax.sound.sampled.SourceDataLine.open(javax.sound.sampled.AudioFormat) throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.SourceDataLine#open(javax.sound.sampled.AudioFormat) public abstract void
     *      javax.sound.sampled.SourceDataLine.open(javax.sound.sampled.AudioFormat) throws
     *      javax.sound.sampled.LineUnavailableException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sound.sampled.SourceDataLine#open(javax.sound.sampled.AudioFormat, int) public
     * abstract void javax.sound.sampled.SourceDataLine.open(javax.sound.sampled.AudioFormat,int) throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.SourceDataLine#open(javax.sound.sampled.AudioFormat, int) public
     * abstract void javax.sound.sampled.SourceDataLine.open(javax.sound.sampled.AudioFormat,int) throws
     * javax.sound.sampled.LineUnavailableException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.SourceDataLine#open(javax.sound.sampled.AudioFormat, int) public abstract void
     *      javax.sound.sampled.SourceDataLine.open(javax.sound.sampled.AudioFormat,int) throws
     *      javax.sound.sampled.LineUnavailableException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sound.sampled.SourceDataLine#write(byte[], int, int) public abstract int
     * javax.sound.sampled.SourceDataLine.write(byte[],int,int)}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.SourceDataLine#write(byte[], int, int) public abstract int
     * javax.sound.sampled.SourceDataLine.write(byte[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.SourceDataLine#write(byte[], int, int) public abstract int
     *      javax.sound.sampled.SourceDataLine.write(byte[],int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

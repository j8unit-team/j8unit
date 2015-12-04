package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sound.sampled.TargetDataLine interface javax.sound.sampled.TargetDataLine},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.sampled.TargetDataLineClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TargetDataLineTests<SUT extends javax.sound.sampled.TargetDataLine>
extends org.j8unit.repository.javax.sound.sampled.DataLineTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.TargetDataLine#read(byte[],int,int) public abstract int javax.sound.sampled.TargetDataLine.read(byte[],int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_byteArray_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.TargetDataLine#open(javax.sound.sampled.AudioFormat) public abstract void javax.sound.sampled.TargetDataLine.open(javax.sound.sampled.AudioFormat) throws javax.sound.sampled.LineUnavailableException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open_AudioFormat() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.TargetDataLine#open(javax.sound.sampled.AudioFormat,int) public abstract void javax.sound.sampled.TargetDataLine.open(javax.sound.sampled.AudioFormat,int) throws javax.sound.sampled.LineUnavailableException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open_AudioFormat_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

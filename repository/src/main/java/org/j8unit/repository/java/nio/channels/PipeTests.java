package org.j8unit.repository.java.nio.channels;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.channels.Pipe class java.nio.channels.Pipe},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.PipeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PipeTests<SUT extends java.nio.channels.Pipe>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.channels.Pipe#source() public abstract java.nio.channels.Pipe$SourceChannel java.nio.channels.Pipe.source()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_source() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Pipe#sink() public abstract java.nio.channels.Pipe$SinkChannel java.nio.channels.Pipe.sink()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sink() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.nio.channels.Pipe$SinkChannel class java.nio.channels.Pipe$SinkChannel},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.nio.channels.PipeClassTests.SinkChannelClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SinkChannelTests<SUT extends java.nio.channels.Pipe.SinkChannel>
    extends org.j8unit.repository.java.nio.channels.WritableByteChannelTests<SUT>,
            org.j8unit.repository.java.nio.channels.GatheringByteChannelTests<SUT>,
            org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link java.nio.channels.Pipe.SinkChannel#validOps() public final int java.nio.channels.Pipe$SinkChannel.validOps()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_validOps() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

     /**
      * <p>
      * The method-under-test covered by this test method is inherited duplicatedly within
      * the declaring class-under-test. In result, there are duplicated according test
      * method within the super test classes. To solve this situation, this method must be
      * overriden. Dont't worry, there will be meaningful test methods soon and, thus,
      * overriding becomes unnecessary.
      * </p>
      */
     @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
     @Test
     @Category(Draft.class)
     @Override
     public default void test_close() throws Exception {
     }

     /**
      * <p>
      * The method-under-test covered by this test method is inherited duplicatedly within
      * the declaring class-under-test. In result, there are duplicated according test
      * method within the super test classes. To solve this situation, this method must be
      * overriden. Dont't worry, there will be meaningful test methods soon and, thus,
      * overriding becomes unnecessary.
      * </p>
      */
     @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
     @Test
     @Category(Draft.class)
     @Override
     public default void test_isOpen() throws Exception {
     }

    }

    /**
     * <p>
     * Test class for {@link java.nio.channels.Pipe$SourceChannel class java.nio.channels.Pipe$SourceChannel},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.nio.channels.PipeClassTests.SourceChannelClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SourceChannelTests<SUT extends java.nio.channels.Pipe.SourceChannel>
    extends org.j8unit.repository.java.nio.channels.ReadableByteChannelTests<SUT>,
            org.j8unit.repository.java.nio.channels.ScatteringByteChannelTests<SUT>,
            org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link java.nio.channels.Pipe.SourceChannel#validOps() public final int java.nio.channels.Pipe$SourceChannel.validOps()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_validOps() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

     /**
      * <p>
      * The method-under-test covered by this test method is inherited duplicatedly within
      * the declaring class-under-test. In result, there are duplicated according test
      * method within the super test classes. To solve this situation, this method must be
      * overriden. Dont't worry, there will be meaningful test methods soon and, thus,
      * overriding becomes unnecessary.
      * </p>
      */
     @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
     @Test
     @Category(Draft.class)
     @Override
     public default void test_close() throws Exception {
     }

     /**
      * <p>
      * The method-under-test covered by this test method is inherited duplicatedly within
      * the declaring class-under-test. In result, there are duplicated according test
      * method within the super test classes. To solve this situation, this method must be
      * overriden. Dont't worry, there will be meaningful test methods soon and, thus,
      * overriding becomes unnecessary.
      * </p>
      */
     @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
     @Test
     @Category(Draft.class)
     @Override
     public default void test_isOpen() throws Exception {
     }

    }

}

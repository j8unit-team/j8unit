package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.Pipe class java.nio.channels.Pipe}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link PipeClassTests}.
 * </p>
 *
 * @see java.nio.channels.Pipe class java.nio.channels.Pipe (the hereby targeted class-under-test class)
 * @see PipeClassTests PipeClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PipeTests<SUT extends java.nio.channels.Pipe>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.Pipe#source() public abstract java.nio.channels.Pipe$SourceChannel
     * java.nio.channels.Pipe.source()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.Pipe#source() public abstract java.nio.channels.Pipe$SourceChannel
     * java.nio.channels.Pipe.source()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.Pipe#source() public abstract java.nio.channels.Pipe$SourceChannel
     *      java.nio.channels.Pipe.source() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_source()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Pipe#sink() public abstract java.nio.channels.Pipe$SinkChannel
     * java.nio.channels.Pipe.sink()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.Pipe#sink() public abstract java.nio.channels.Pipe$SinkChannel
     * java.nio.channels.Pipe.sink()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.Pipe#sink() public abstract java.nio.channels.Pipe$SinkChannel
     *      java.nio.channels.Pipe.sink() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sink()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.nio.channels.Pipe.SourceChannel class
     * java.nio.channels.Pipe$SourceChannel}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link PipeClassTests.SourceChannelClassTests}.
     * </p>
     *
     * @see java.nio.channels.Pipe.SourceChannel class java.nio.channels.Pipe$SourceChannel (the hereby targeted
     *      class-under-test class)
     * @see PipeClassTests.SourceChannelClassTests PipeClassTests.SourceChannelClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SourceChannelTests<SUT extends java.nio.channels.Pipe.SourceChannel>
    extends ReadableByteChannelTests<SUT>, ScatteringByteChannelTests<SUT>, org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.nio.channels.Pipe.SourceChannel#validOps() public final int
         * java.nio.channels.Pipe$SourceChannel.validOps()}.
         *
         * <p>
         * Test method for {@link java.nio.channels.Pipe.SourceChannel#validOps() public final int
         * java.nio.channels.Pipe$SourceChannel.validOps()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.nio.channels.Pipe.SourceChannel#validOps() public final int
         *      java.nio.channels.Pipe$SourceChannel.validOps() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_validOps()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.nio.channels.SelectableChannel#close() class java.nio.channels.SelectableChannel}</li>
         * <li>{@linkplain java.nio.channels.Channel#close() interface java.nio.channels.Channel}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_close()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.nio.channels.SelectableChannel#isOpen() class java.nio.channels.SelectableChannel}</li>
         * <li>{@linkplain java.nio.channels.Channel#isOpen() interface java.nio.channels.Channel}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_isOpen()
        throws Exception {
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.nio.channels.Pipe.SinkChannel class
     * java.nio.channels.Pipe$SinkChannel}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link PipeClassTests.SinkChannelClassTests}.
     * </p>
     *
     * @see java.nio.channels.Pipe.SinkChannel class java.nio.channels.Pipe$SinkChannel (the hereby targeted
     *      class-under-test class)
     * @see PipeClassTests.SinkChannelClassTests PipeClassTests.SinkChannelClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SinkChannelTests<SUT extends java.nio.channels.Pipe.SinkChannel>
    extends WritableByteChannelTests<SUT>, GatheringByteChannelTests<SUT>, org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.nio.channels.Pipe.SinkChannel#validOps() public final int
         * java.nio.channels.Pipe$SinkChannel.validOps()}.
         *
         * <p>
         * Test method for {@link java.nio.channels.Pipe.SinkChannel#validOps() public final int
         * java.nio.channels.Pipe$SinkChannel.validOps()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.nio.channels.Pipe.SinkChannel#validOps() public final int
         *      java.nio.channels.Pipe$SinkChannel.validOps() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_validOps()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.nio.channels.SelectableChannel#close() class java.nio.channels.SelectableChannel}</li>
         * <li>{@linkplain java.nio.channels.Channel#close() interface java.nio.channels.Channel}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_close()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>{@linkplain java.nio.channels.SelectableChannel#isOpen() class java.nio.channels.SelectableChannel}</li>
         * <li>{@linkplain java.nio.channels.Channel#isOpen() interface java.nio.channels.Channel}</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test methods within the parent test classes. To solve this
         * situation, this method must be overridden. Dont't worry, there will be meaningful test methods soon and,
         * thus, overriding becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_isOpen()
        throws Exception {
        }

    }

}

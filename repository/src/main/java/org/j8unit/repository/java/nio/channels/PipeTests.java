package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.channels.Pipe class java.nio.channels.Pipe}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.channels.PipeTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.channels.PipeClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.channels.Pipe
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PipeTests<SUT extends java.nio.channels.Pipe>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.nio.channels.Pipe.SinkChannel class
     * java.nio.channels.Pipe$SinkChannel}, containing all instance relevant test methods (i.&thinsp;e., test methods of
     * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.nio.channels.PipeTests.SinkChannelTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.nio.channels.PipeClassTests.SinkChannelClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.nio.channels.Pipe.SinkChannel
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SinkChannelTests<SUT extends java.nio.channels.Pipe.SinkChannel>
    extends org.j8unit.repository.java.nio.channels.WritableByteChannelTests<SUT>, org.j8unit.repository.java.nio.channels.GatheringByteChannelTests<SUT>,
    org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT> {

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>interface java.nio.channels.Channel</li>
         * <li>class java.nio.channels.SelectableChannel</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test method within the super test classes. To solve this situation,
         * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
         * becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_close()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>interface java.nio.channels.Channel</li>
         * <li>class java.nio.channels.SelectableChannel</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test method within the super test classes. To solve this situation,
         * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
         * becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_isOpen()
        throws Exception {
        }

        /**
         * <p>
         * Test method for {@link java.nio.channels.Pipe.SinkChannel#validOps() public final int
         * java.nio.channels.Pipe$SinkChannel.validOps()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.nio.channels.Pipe.SinkChannel#validOps()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_validOps()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.nio.channels.Pipe.SourceChannel class
     * java.nio.channels.Pipe$SourceChannel}, containing all instance relevant test methods (i.&thinsp;e., test methods
     * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods
     * is {@link org.j8unit.repository.java.nio.channels.PipeTests.SourceChannelTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.nio.channels.PipeClassTests.SourceChannelClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.nio.channels.Pipe.SourceChannel
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SourceChannelTests<SUT extends java.nio.channels.Pipe.SourceChannel>
    extends org.j8unit.repository.java.nio.channels.ReadableByteChannelTests<SUT>, org.j8unit.repository.java.nio.channels.ScatteringByteChannelTests<SUT>,
    org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT> {

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>interface java.nio.channels.Channel</li>
         * <li>class java.nio.channels.SelectableChannel</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test method within the super test classes. To solve this situation,
         * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
         * becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_close()
        throws Exception {
        }

        /**
         * <p>
         * The method-under-test covered by this test method is inherited duplicatedly within the declaring
         * class-under-test:
         * </p>
         * <ul>
         * <li>interface java.nio.channels.Channel</li>
         * <li>class java.nio.channels.SelectableChannel</li>
         * </ul>
         *
         * <p>
         * In result, there are duplicated according test method within the super test classes. To solve this situation,
         * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
         * becomes unnecessary.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_isOpen()
        throws Exception {
        }

        /**
         * <p>
         * Test method for {@link java.nio.channels.Pipe.SourceChannel#validOps() public final int
         * java.nio.channels.Pipe$SourceChannel.validOps()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.nio.channels.Pipe.SourceChannel#validOps()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_validOps()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.Pipe#sink() public abstract java.nio.channels.Pipe$SinkChannel
     * java.nio.channels.Pipe.sink()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.channels.Pipe#sink()
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
     * Test method for {@link java.nio.channels.Pipe#source() public abstract java.nio.channels.Pipe$SourceChannel
     * java.nio.channels.Pipe.source()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.channels.Pipe#source()
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

}

package org.j8unit.repository.java.nio.channels;

import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SinkChannel;
import java.nio.channels.Pipe.SourceChannel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Pipe public
 * abstract class java.nio.channels.Pipe}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.nio.channels.PipeClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PipeTests<SUT extends Pipe>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.channels.Pipe#source() public abstract
     * java.nio.channels.Pipe$SourceChannel java.nio.channels.Pipe.source()}.
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
    public default void test_source()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.channels.Pipe#sink() public abstract
     * java.nio.channels.Pipe$SinkChannel java.nio.channels.Pipe.sink()}.
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
    public default void test_sink()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.Pipe]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.Pipe]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link SourceChannel public abstract static class java.nio.channels.Pipe$SourceChannel}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.java.nio.channels.PipeClassTests.SourceChannelClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SourceChannelTests<SUT extends SourceChannel>
    extends org.j8unit.repository.java.nio.channels.ScatteringByteChannelTests<SUT>,
    org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe$SourceChannel]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.nio.channels.Pipe.SourceChannel#validOps()
         * public final int java.nio.channels.Pipe$SourceChannel.validOps()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.Pipe$SourceChannel]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.Pipe$SourceChannel]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link SinkChannel
     * public abstract static class java.nio.channels.Pipe$SinkChannel}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.java.nio.channels.PipeClassTests.SinkChannelClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SinkChannelTests<SUT extends SinkChannel>
    extends org.j8unit.repository.java.nio.channels.GatheringByteChannelTests<SUT>,
    org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.Pipe$SinkChannel]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.nio.channels.Pipe.SinkChannel#validOps()
         * public final int java.nio.channels.Pipe$SinkChannel.validOps()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.Pipe$SinkChannel]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.Pipe$SinkChannel]
    }

}

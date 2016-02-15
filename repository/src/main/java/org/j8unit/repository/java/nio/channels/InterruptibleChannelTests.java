package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.InterruptibleChannel interface
 * java.nio.channels.InterruptibleChannel}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link InterruptibleChannelClassTests}.
 * </p>
 *
 * @see java.nio.channels.InterruptibleChannel interface java.nio.channels.InterruptibleChannel (the hereby targeted
 *      class-under-test class)
 * @see InterruptibleChannelClassTests InterruptibleChannelClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InterruptibleChannelTests<SUT extends java.nio.channels.InterruptibleChannel>
extends ChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.InterruptibleChannel#close() public abstract void
     * java.nio.channels.InterruptibleChannel.close() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.InterruptibleChannel#close() public abstract void
     * java.nio.channels.InterruptibleChannel.close() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.InterruptibleChannel#close() public abstract void
     *      java.nio.channels.InterruptibleChannel.close() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

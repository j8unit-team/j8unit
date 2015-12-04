package org.j8unit.repository.java.nio.channels.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.spi.AbstractInterruptibleChannel class
 * java.nio.channels.spi.AbstractInterruptibleChannel}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.spi.AbstractInterruptibleChannelClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractInterruptibleChannelTests<SUT extends java.nio.channels.spi.AbstractInterruptibleChannel>
extends org.j8unit.repository.java.nio.channels.ChannelTests<SUT>, org.j8unit.repository.java.nio.channels.InterruptibleChannelTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractInterruptibleChannel#close() public final void
     * java.nio.channels.spi.AbstractInterruptibleChannel.close() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractInterruptibleChannel#isOpen() public final boolean
     * java.nio.channels.spi.AbstractInterruptibleChannel.isOpen()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isOpen()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

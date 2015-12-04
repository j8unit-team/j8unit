package org.j8unit.repository.java.nio.channels.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.spi.AbstractSelectionKey class java.nio.channels.spi.AbstractSelectionKey},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.spi.AbstractSelectionKeyClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractSelectionKeyTests<SUT extends java.nio.channels.spi.AbstractSelectionKey>
extends org.j8unit.repository.java.nio.channels.SelectionKeyTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectionKey#cancel() public final void
     * java.nio.channels.spi.AbstractSelectionKey.cancel()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_cancel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelectionKey#isValid() public final boolean
     * java.nio.channels.spi.AbstractSelectionKey.isValid()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isValid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

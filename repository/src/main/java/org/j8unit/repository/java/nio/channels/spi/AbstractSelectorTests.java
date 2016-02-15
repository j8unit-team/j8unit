package org.j8unit.repository.java.nio.channels.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.spi.AbstractSelector class
 * java.nio.channels.spi.AbstractSelector}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AbstractSelectorClassTests}.
 * </p>
 *
 * @see java.nio.channels.spi.AbstractSelector class java.nio.channels.spi.AbstractSelector (the hereby targeted
 *      class-under-test class)
 * @see AbstractSelectorClassTests AbstractSelectorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractSelectorTests<SUT extends java.nio.channels.spi.AbstractSelector>
extends org.j8unit.repository.java.nio.channels.SelectorTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelector#isOpen() public final boolean
     * java.nio.channels.spi.AbstractSelector.isOpen()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelector#isOpen() public final boolean
     * java.nio.channels.spi.AbstractSelector.isOpen()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.AbstractSelector#isOpen() public final boolean
     *      java.nio.channels.spi.AbstractSelector.isOpen() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isOpen()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelector#provider() public final
     * java.nio.channels.spi.SelectorProvider java.nio.channels.spi.AbstractSelector.provider()}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelector#provider() public final
     * java.nio.channels.spi.SelectorProvider java.nio.channels.spi.AbstractSelector.provider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.AbstractSelector#provider() public final java.nio.channels.spi.SelectorProvider
     *      java.nio.channels.spi.AbstractSelector.provider() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_provider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelector#close() public final void
     * java.nio.channels.spi.AbstractSelector.close() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.nio.channels.spi.AbstractSelector#close() public final void
     * java.nio.channels.spi.AbstractSelector.close() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.channels.spi.AbstractSelector#close() public final void
     *      java.nio.channels.spi.AbstractSelector.close() throws java.io.IOException (the hereby targeted
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

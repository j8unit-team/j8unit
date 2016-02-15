package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.Notation interface org.w3c.dom.Notation}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link NotationClassTests}.
 * </p>
 *
 * @see org.w3c.dom.Notation interface org.w3c.dom.Notation (the hereby targeted class-under-test class)
 * @see NotationClassTests NotationClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotationTests<SUT extends org.w3c.dom.Notation>
extends NodeTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Notation#getPublicId() public abstract java.lang.String
     * org.w3c.dom.Notation.getPublicId()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Notation#getPublicId() public abstract java.lang.String
     * org.w3c.dom.Notation.getPublicId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Notation#getPublicId() public abstract java.lang.String org.w3c.dom.Notation.getPublicId() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPublicId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.Notation#getSystemId() public abstract java.lang.String
     * org.w3c.dom.Notation.getSystemId()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.Notation#getSystemId() public abstract java.lang.String
     * org.w3c.dom.Notation.getSystemId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.Notation#getSystemId() public abstract java.lang.String org.w3c.dom.Notation.getSystemId() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSystemId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.css.Counter interface org.w3c.dom.css.Counter}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CounterClassTests}.
 * </p>
 *
 * @see org.w3c.dom.css.Counter interface org.w3c.dom.css.Counter (the hereby targeted class-under-test class)
 * @see CounterClassTests CounterClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CounterTests<SUT extends org.w3c.dom.css.Counter>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.Counter#getIdentifier() public abstract java.lang.String
     * org.w3c.dom.css.Counter.getIdentifier()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.css.Counter#getIdentifier() public abstract java.lang.String
     * org.w3c.dom.css.Counter.getIdentifier()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.css.Counter#getIdentifier() public abstract java.lang.String
     *      org.w3c.dom.css.Counter.getIdentifier() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIdentifier()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.Counter#getListStyle() public abstract java.lang.String
     * org.w3c.dom.css.Counter.getListStyle()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.css.Counter#getListStyle() public abstract java.lang.String
     * org.w3c.dom.css.Counter.getListStyle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.css.Counter#getListStyle() public abstract java.lang.String
     *      org.w3c.dom.css.Counter.getListStyle() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getListStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.Counter#getSeparator() public abstract java.lang.String
     * org.w3c.dom.css.Counter.getSeparator()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.css.Counter#getSeparator() public abstract java.lang.String
     * org.w3c.dom.css.Counter.getSeparator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.css.Counter#getSeparator() public abstract java.lang.String
     *      org.w3c.dom.css.Counter.getSeparator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSeparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.DOMStringList interface org.w3c.dom.DOMStringList}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DOMStringListClassTests}.
 * </p>
 *
 * @see org.w3c.dom.DOMStringList interface org.w3c.dom.DOMStringList (the hereby targeted class-under-test class)
 * @see DOMStringListClassTests DOMStringListClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DOMStringListTests<SUT extends org.w3c.dom.DOMStringList>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMStringList#contains(String) public abstract boolean
     * org.w3c.dom.DOMStringList.contains(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMStringList#contains(String) public abstract boolean
     * org.w3c.dom.DOMStringList.contains(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMStringList#contains(String) public abstract boolean
     *      org.w3c.dom.DOMStringList.contains(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_contains_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMStringList#item(int) public abstract java.lang.String
     * org.w3c.dom.DOMStringList.item(int)}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMStringList#item(int) public abstract java.lang.String
     * org.w3c.dom.DOMStringList.item(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMStringList#item(int) public abstract java.lang.String org.w3c.dom.DOMStringList.item(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_item_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.DOMStringList#getLength() public abstract int
     * org.w3c.dom.DOMStringList.getLength()}.
     *
     * <p>
     * Test method for {@link org.w3c.dom.DOMStringList#getLength() public abstract int
     * org.w3c.dom.DOMStringList.getLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.w3c.dom.DOMStringList#getLength() public abstract int org.w3c.dom.DOMStringList.getLength() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

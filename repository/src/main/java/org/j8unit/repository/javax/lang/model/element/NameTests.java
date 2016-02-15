package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.element.Name interface javax.lang.model.element.Name}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link NameClassTests}.
 * </p>
 *
 * @see javax.lang.model.element.Name interface javax.lang.model.element.Name (the hereby targeted class-under-test
 *      class)
 * @see NameClassTests NameClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NameTests<SUT extends javax.lang.model.element.Name>
extends org.j8unit.repository.java.lang.CharSequenceTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.Name#equals(Object) public abstract boolean
     * javax.lang.model.element.Name.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.Name#equals(Object) public abstract boolean
     * javax.lang.model.element.Name.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.Name#equals(Object) public abstract boolean
     *      javax.lang.model.element.Name.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.Name#contentEquals(CharSequence) public abstract boolean
     * javax.lang.model.element.Name.contentEquals(java.lang.CharSequence)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.Name#contentEquals(CharSequence) public abstract boolean
     * javax.lang.model.element.Name.contentEquals(java.lang.CharSequence)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.Name#contentEquals(CharSequence) public abstract boolean
     *      javax.lang.model.element.Name.contentEquals(java.lang.CharSequence) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_contentEquals_CharSequence()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.Name#hashCode() public abstract int
     * javax.lang.model.element.Name.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.Name#hashCode() public abstract int
     * javax.lang.model.element.Name.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.Name#hashCode() public abstract int javax.lang.model.element.Name.hashCode() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

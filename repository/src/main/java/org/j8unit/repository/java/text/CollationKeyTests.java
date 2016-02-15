package org.j8unit.repository.java.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.text.CollationKey class java.text.CollationKey}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link CollationKeyClassTests}.
 * </p>
 *
 * @see java.text.CollationKey class java.text.CollationKey (the hereby targeted class-under-test class)
 * @see CollationKeyClassTests CollationKeyClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CollationKeyTests<SUT extends java.text.CollationKey>
extends org.j8unit.repository.java.lang.ComparableTests<SUT, java.text.CollationKey>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.text.CollationKey#getSourceString() public java.lang.String
     * java.text.CollationKey.getSourceString()}.
     *
     * <p>
     * Test method for {@link java.text.CollationKey#getSourceString() public java.lang.String
     * java.text.CollationKey.getSourceString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.CollationKey#getSourceString() public java.lang.String java.text.CollationKey.getSourceString()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSourceString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.CollationKey#toByteArray() public abstract byte[]
     * java.text.CollationKey.toByteArray()}.
     *
     * <p>
     * Test method for {@link java.text.CollationKey#toByteArray() public abstract byte[]
     * java.text.CollationKey.toByteArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.CollationKey#toByteArray() public abstract byte[] java.text.CollationKey.toByteArray() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toByteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.CollationKey#compareTo(java.text.CollationKey) public abstract int
     * java.text.CollationKey.compareTo(java.text.CollationKey)}.
     *
     * <p>
     * Test method for {@link java.text.CollationKey#compareTo(java.text.CollationKey) public abstract int
     * java.text.CollationKey.compareTo(java.text.CollationKey)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.CollationKey#compareTo(java.text.CollationKey) public abstract int
     *      java.text.CollationKey.compareTo(java.text.CollationKey) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareTo_CollationKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

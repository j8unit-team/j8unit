package org.j8unit.repository.java.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.text.Collator class java.text.Collator}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link CollatorClassTests}.
 * </p>
 *
 * @see java.text.Collator class java.text.Collator (the hereby targeted class-under-test class)
 * @see CollatorClassTests CollatorClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CollatorTests<SUT extends java.text.Collator>
extends org.j8unit.repository.java.util.ComparatorTests<SUT, Object>, org.j8unit.repository.java.lang.CloneableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.text.Collator#setDecomposition(int) public synchronized void
     * java.text.Collator.setDecomposition(int)}.
     *
     * <p>
     * Test method for {@link java.text.Collator#setDecomposition(int) public synchronized void
     * java.text.Collator.setDecomposition(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#setDecomposition(int) public synchronized void java.text.Collator.setDecomposition(int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDecomposition_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Collator#clone() public java.lang.Object java.text.Collator.clone()}.
     *
     * <p>
     * Test method for {@link java.text.Collator#clone() public java.lang.Object java.text.Collator.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#clone() public java.lang.Object java.text.Collator.clone() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Collator#getStrength() public synchronized int java.text.Collator.getStrength()}
     * .
     *
     * <p>
     * Test method for {@link java.text.Collator#getStrength() public synchronized int java.text.Collator.getStrength()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#getStrength() public synchronized int java.text.Collator.getStrength() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStrength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Collator#equals(String, String) public boolean
     * java.text.Collator.equals(java.lang.String,java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.text.Collator#equals(String, String) public boolean
     * java.text.Collator.equals(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#equals(String, String) public boolean
     *      java.text.Collator.equals(java.lang.String,java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Collator#equals(Object) public boolean
     * java.text.Collator.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.text.Collator#equals(Object) public boolean
     * java.text.Collator.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#equals(Object) public boolean java.text.Collator.equals(java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.text.Collator#hashCode() public abstract int java.text.Collator.hashCode()}.
     *
     * <p>
     * Test method for {@link java.text.Collator#hashCode() public abstract int java.text.Collator.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#hashCode() public abstract int java.text.Collator.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Collator#getCollationKey(String) public abstract java.text.CollationKey
     * java.text.Collator.getCollationKey(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.text.Collator#getCollationKey(String) public abstract java.text.CollationKey
     * java.text.Collator.getCollationKey(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#getCollationKey(String) public abstract java.text.CollationKey
     *      java.text.Collator.getCollationKey(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCollationKey_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Collator#setStrength(int) public synchronized void
     * java.text.Collator.setStrength(int)}.
     *
     * <p>
     * Test method for {@link java.text.Collator#setStrength(int) public synchronized void
     * java.text.Collator.setStrength(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#setStrength(int) public synchronized void java.text.Collator.setStrength(int) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setStrength_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Collator#compare(Object, Object) public int
     * java.text.Collator.compare(java.lang.Object,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.text.Collator#compare(Object, Object) public int
     * java.text.Collator.compare(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#compare(Object, Object) public int
     *      java.text.Collator.compare(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_compare_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Collator#compare(String, String) public abstract int
     * java.text.Collator.compare(java.lang.String,java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.text.Collator#compare(String, String) public abstract int
     * java.text.Collator.compare(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#compare(String, String) public abstract int
     *      java.text.Collator.compare(java.lang.String,java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compare_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.Collator#getDecomposition() public synchronized int
     * java.text.Collator.getDecomposition()}.
     *
     * <p>
     * Test method for {@link java.text.Collator#getDecomposition() public synchronized int
     * java.text.Collator.getDecomposition()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.Collator#getDecomposition() public synchronized int java.text.Collator.getDecomposition() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDecomposition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

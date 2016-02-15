package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.OptionalInt class java.util.OptionalInt}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link OptionalIntClassTests}.
 * </p>
 *
 * @see java.util.OptionalInt class java.util.OptionalInt (the hereby targeted class-under-test class)
 * @see OptionalIntClassTests OptionalIntClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OptionalIntTests<SUT extends java.util.OptionalInt>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.OptionalInt#orElse(int) public int java.util.OptionalInt.orElse(int)}.
     *
     * <p>
     * Test method for {@link java.util.OptionalInt#orElse(int) public int java.util.OptionalInt.orElse(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.OptionalInt#orElse(int) public int java.util.OptionalInt.orElse(int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_orElse_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.OptionalInt#orElseThrow(java.util.function.Supplier) public <X> int
     * java.util.OptionalInt.orElseThrow(java.util.function.Supplier<X>) throws X}.
     *
     * <p>
     * Test method for {@link java.util.OptionalInt#orElseThrow(java.util.function.Supplier) public int
     * java.util.OptionalInt.orElseThrow(java.util.function.Supplier) throws java.lang.Throwable}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.OptionalInt#orElseThrow(java.util.function.Supplier) public int
     *      java.util.OptionalInt.orElseThrow(java.util.function.Supplier) throws java.lang.Throwable (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_orElseThrow_Supplier()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.OptionalInt#getAsInt() public int java.util.OptionalInt.getAsInt()}.
     *
     * <p>
     * Test method for {@link java.util.OptionalInt#getAsInt() public int java.util.OptionalInt.getAsInt()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.OptionalInt#getAsInt() public int java.util.OptionalInt.getAsInt() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAsInt()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.OptionalInt#isPresent() public boolean java.util.OptionalInt.isPresent()}.
     *
     * <p>
     * Test method for {@link java.util.OptionalInt#isPresent() public boolean java.util.OptionalInt.isPresent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.OptionalInt#isPresent() public boolean java.util.OptionalInt.isPresent() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPresent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.OptionalInt#toString() public java.lang.String java.util.OptionalInt.toString()}
     * .
     *
     * <p>
     * Test method for {@link java.util.OptionalInt#toString() public java.lang.String java.util.OptionalInt.toString()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.OptionalInt#toString() public java.lang.String java.util.OptionalInt.toString() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.OptionalInt#orElseGet(java.util.function.IntSupplier) public int
     * java.util.OptionalInt.orElseGet(java.util.function.IntSupplier)}.
     *
     * <p>
     * Test method for {@link java.util.OptionalInt#orElseGet(java.util.function.IntSupplier) public int
     * java.util.OptionalInt.orElseGet(java.util.function.IntSupplier)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.OptionalInt#orElseGet(java.util.function.IntSupplier) public int
     *      java.util.OptionalInt.orElseGet(java.util.function.IntSupplier) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_orElseGet_IntSupplier()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.OptionalInt#equals(Object) public boolean
     * java.util.OptionalInt.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.OptionalInt#equals(Object) public boolean
     * java.util.OptionalInt.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.OptionalInt#equals(Object) public boolean java.util.OptionalInt.equals(java.lang.Object) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.OptionalInt#ifPresent(java.util.function.IntConsumer) public void
     * java.util.OptionalInt.ifPresent(java.util.function.IntConsumer)}.
     *
     * <p>
     * Test method for {@link java.util.OptionalInt#ifPresent(java.util.function.IntConsumer) public void
     * java.util.OptionalInt.ifPresent(java.util.function.IntConsumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.OptionalInt#ifPresent(java.util.function.IntConsumer) public void
     *      java.util.OptionalInt.ifPresent(java.util.function.IntConsumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ifPresent_IntConsumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.OptionalInt#hashCode() public int java.util.OptionalInt.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.OptionalInt#hashCode() public int java.util.OptionalInt.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.OptionalInt#hashCode() public int java.util.OptionalInt.hashCode() (the hereby targeted
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

}

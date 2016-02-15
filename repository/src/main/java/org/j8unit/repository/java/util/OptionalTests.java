package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.Optional class java.util.Optional}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link OptionalClassTests}.
 * </p>
 *
 * @see java.util.Optional class java.util.Optional (the hereby targeted class-under-test class)
 * @see OptionalClassTests OptionalClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OptionalTests<SUT extends java.util.Optional<T>, T>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.Optional#isPresent() public boolean java.util.Optional.isPresent()}.
     *
     * <p>
     * Test method for {@link java.util.Optional#isPresent() public boolean java.util.Optional.isPresent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#isPresent() public boolean java.util.Optional.isPresent() (the hereby targeted
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
     * Test method for {@link java.util.Optional#toString() public java.lang.String java.util.Optional.toString()}.
     *
     * <p>
     * Test method for {@link java.util.Optional#toString() public java.lang.String java.util.Optional.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#toString() public java.lang.String java.util.Optional.toString() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.Optional#map(java.util.function.Function) public <U> java.util.Optional
     * <U> java.util.Optional.map(java.util.function.Function<? super T, ? extends U>)}.
     *
     * <p>
     * Test method for {@link java.util.Optional#map(java.util.function.Function) public java.util.Optional
     * java.util.Optional.map(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#map(java.util.function.Function) public java.util.Optional
     *      java.util.Optional.map(java.util.function.Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_map_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Optional#orElse(Object) public T java.util.Optional.orElse(T)}.
     *
     * <p>
     * Test method for {@link java.util.Optional#orElse(Object) public java.lang.Object
     * java.util.Optional.orElse(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#orElse(Object) public java.lang.Object java.util.Optional.orElse(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_orElse_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Optional#orElseThrow(java.util.function.Supplier) public <X> T
     * java.util.Optional.orElseThrow(java.util.function.Supplier<? extends X>) throws X}.
     *
     * <p>
     * Test method for {@link java.util.Optional#orElseThrow(java.util.function.Supplier) public java.lang.Object
     * java.util.Optional.orElseThrow(java.util.function.Supplier) throws java.lang.Throwable}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#orElseThrow(java.util.function.Supplier) public java.lang.Object
     *      java.util.Optional.orElseThrow(java.util.function.Supplier) throws java.lang.Throwable (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.Optional#filter(java.util.function.Predicate) public java.util.Optional
     * <T> java.util.Optional.filter(java.util.function.Predicate<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.Optional#filter(java.util.function.Predicate) public java.util.Optional
     * java.util.Optional.filter(java.util.function.Predicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#filter(java.util.function.Predicate) public java.util.Optional
     *      java.util.Optional.filter(java.util.function.Predicate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_filter_Predicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Optional#flatMap(java.util.function.Function) public <U> java.util.Optional
     * <U> java.util.Optional.flatMap(java.util.function.Function<? super T, java.util.Optional<U>>)}.
     *
     * <p>
     * Test method for {@link java.util.Optional#flatMap(java.util.function.Function) public java.util.Optional
     * java.util.Optional.flatMap(java.util.function.Function)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#flatMap(java.util.function.Function) public java.util.Optional
     *      java.util.Optional.flatMap(java.util.function.Function) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_flatMap_Function()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Optional#orElseGet(java.util.function.Supplier) public T
     * java.util.Optional.orElseGet(java.util.function.Supplier<? extends T>)}.
     *
     * <p>
     * Test method for {@link java.util.Optional#orElseGet(java.util.function.Supplier) public java.lang.Object
     * java.util.Optional.orElseGet(java.util.function.Supplier)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#orElseGet(java.util.function.Supplier) public java.lang.Object
     *      java.util.Optional.orElseGet(java.util.function.Supplier) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_orElseGet_Supplier()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Optional#get() public T java.util.Optional.get()}.
     *
     * <p>
     * Test method for {@link java.util.Optional#get() public java.lang.Object java.util.Optional.get()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#get() public java.lang.Object java.util.Optional.get() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Optional#equals(Object) public boolean
     * java.util.Optional.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Optional#equals(Object) public boolean
     * java.util.Optional.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#equals(Object) public boolean java.util.Optional.equals(java.lang.Object) (the hereby
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
     * Test method for {@link java.util.Optional#ifPresent(java.util.function.Consumer) public void
     * java.util.Optional.ifPresent(java.util.function.Consumer<? super T>)}.
     *
     * <p>
     * Test method for {@link java.util.Optional#ifPresent(java.util.function.Consumer) public void
     * java.util.Optional.ifPresent(java.util.function.Consumer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#ifPresent(java.util.function.Consumer) public void
     *      java.util.Optional.ifPresent(java.util.function.Consumer) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ifPresent_Consumer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Optional#hashCode() public int java.util.Optional.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.Optional#hashCode() public int java.util.Optional.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Optional#hashCode() public int java.util.Optional.hashCode() (the hereby targeted
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

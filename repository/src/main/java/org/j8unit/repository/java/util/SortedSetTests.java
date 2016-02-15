package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.SortedSet interface java.util.SortedSet}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SortedSetClassTests}.
 * </p>
 *
 * @see java.util.SortedSet interface java.util.SortedSet (the hereby targeted class-under-test class)
 * @see SortedSetClassTests SortedSetClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SortedSetTests<SUT extends java.util.SortedSet<E>, E>
extends SetTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.SortedSet#last() public abstract E java.util.SortedSet.last()}.
     *
     * <p>
     * Test method for {@link java.util.SortedSet#last() public abstract java.lang.Object java.util.SortedSet.last()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedSet#last() public abstract java.lang.Object java.util.SortedSet.last() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_last()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.SortedSet#spliterator() public default java.util.Spliterator
     * <E> java.util.SortedSet.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.SortedSet#spliterator() public default java.util.Spliterator
     * java.util.SortedSet.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedSet#spliterator() public default java.util.Spliterator java.util.SortedSet.spliterator()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_spliterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.SortedSet#headSet(Object) public abstract java.util.SortedSet
     * <E> java.util.SortedSet.headSet(E)}.
     *
     * <p>
     * Test method for {@link java.util.SortedSet#headSet(Object) public abstract java.util.SortedSet
     * java.util.SortedSet.headSet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedSet#headSet(Object) public abstract java.util.SortedSet
     *      java.util.SortedSet.headSet(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_headSet_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.SortedSet#tailSet(Object) public abstract java.util.SortedSet
     * <E> java.util.SortedSet.tailSet(E)}.
     *
     * <p>
     * Test method for {@link java.util.SortedSet#tailSet(Object) public abstract java.util.SortedSet
     * java.util.SortedSet.tailSet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedSet#tailSet(Object) public abstract java.util.SortedSet
     *      java.util.SortedSet.tailSet(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_tailSet_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.SortedSet#comparator() public abstract java.util.Comparator<? super E>
     * java.util.SortedSet.comparator()}.
     *
     * <p>
     * Test method for {@link java.util.SortedSet#comparator() public abstract java.util.Comparator
     * java.util.SortedSet.comparator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedSet#comparator() public abstract java.util.Comparator java.util.SortedSet.comparator() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.SortedSet#first() public abstract E java.util.SortedSet.first()}.
     *
     * <p>
     * Test method for {@link java.util.SortedSet#first() public abstract java.lang.Object java.util.SortedSet.first()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedSet#first() public abstract java.lang.Object java.util.SortedSet.first() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_first()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.SortedSet#subSet(Object, Object) public abstract java.util.SortedSet
     * <E> java.util.SortedSet.subSet(E,E)}.
     *
     * <p>
     * Test method for {@link java.util.SortedSet#subSet(Object, Object) public abstract java.util.SortedSet
     * java.util.SortedSet.subSet(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.SortedSet#subSet(Object, Object) public abstract java.util.SortedSet
     *      java.util.SortedSet.subSet(java.lang.Object,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_subSet_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

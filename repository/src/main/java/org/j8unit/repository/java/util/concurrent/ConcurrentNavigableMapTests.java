package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.ConcurrentNavigableMap interface
 * java.util.concurrent.ConcurrentNavigableMap}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.util.concurrent.ConcurrentNavigableMapTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.ConcurrentNavigableMapClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConcurrentNavigableMapTests<SUT extends java.util.concurrent.ConcurrentNavigableMap<K, V>, K, V>
extends org.j8unit.repository.java.util.concurrent.ConcurrentMapTests<SUT, K, V>, org.j8unit.repository.java.util.NavigableMapTests<SUT, K, V> {

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_compute_Object_BiFunction()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_computeIfAbsent_Object_Function()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_computeIfPresent_Object_BiFunction()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#descendingKeySet() public abstract
     * java.util.NavigableSet java.util.concurrent.ConcurrentNavigableMap.descendingKeySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap#descendingKeySet()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_descendingKeySet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#descendingMap() public abstract
     * java.util.concurrent.ConcurrentNavigableMap java.util.concurrent.ConcurrentNavigableMap.descendingMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap#descendingMap()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_descendingMap()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.SortedMap</li>
     * <li>interface java.util.Map</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_entrySet()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_forEach_BiConsumer()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getOrDefault_Object_Object()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#headMap(java.lang.Object) public abstract
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.headMap(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap#headMap(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_headMap_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#headMap(java.lang.Object, boolean) public
     * abstract java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.headMap(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap#headMap(java.lang.Object, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_headMap_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#keySet() public abstract
     * java.util.NavigableSet java.util.concurrent.ConcurrentNavigableMap.keySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap#keySet()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_keySet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_merge_Object_Object_BiFunction()
    throws Exception {
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#navigableKeySet() public abstract
     * java.util.NavigableSet java.util.concurrent.ConcurrentNavigableMap.navigableKeySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap#navigableKeySet()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_navigableKeySet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_putIfAbsent_Object_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_remove_Object_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_replace_Object_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_replace_Object_Object_Object()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.Map</li>
     * <li>interface java.util.concurrent.ConcurrentMap</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_replaceAll_BiFunction()
    throws Exception {
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.ConcurrentNavigableMap#subMap(java.lang.Object, boolean, java.lang.Object, boolean)
     * public abstract java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.subMap(java.lang.Object,boolean,java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap#subMap(java.lang.Object, boolean, java.lang.Object,
     *             boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_subMap_Object_boolean_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#subMap(java.lang.Object, java.lang.Object)
     * public abstract java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.subMap(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap#subMap(java.lang.Object, java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_subMap_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#tailMap(java.lang.Object) public abstract
     * java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.tailMap(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap#tailMap(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_tailMap_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentNavigableMap#tailMap(java.lang.Object, boolean) public
     * abstract java.util.concurrent.ConcurrentNavigableMap
     * java.util.concurrent.ConcurrentNavigableMap.tailMap(java.lang.Object,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.concurrent.ConcurrentNavigableMap#tailMap(java.lang.Object, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_tailMap_Object_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>interface java.util.SortedMap</li>
     * <li>interface java.util.Map</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test method within the super test classes. To solve this situation,
     * this method must be overriden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_values()
    throws Exception {
    }

}

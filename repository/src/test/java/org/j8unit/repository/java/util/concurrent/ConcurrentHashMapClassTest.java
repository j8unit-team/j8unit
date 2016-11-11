package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ConcurrentHashMap} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ConcurrentHashMapClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConcurrentHashMapClassTest
implements ConcurrentHashMapClassTests<ConcurrentHashMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ConcurrentHashMap]

    @Override
    public Class<ConcurrentHashMap> createNewSUT() {
        return ConcurrentHashMap.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int) public
     * java.util.concurrent.ConcurrentHashMap(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ConcurrentHashMap_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentHashMap sut = null; // = new ConcurrentHashMap(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap() public
     * java.util.concurrent.ConcurrentHashMap()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ConcurrentHashMap()
    throws Exception {
        // create new instance
        final ConcurrentHashMap sut = new ConcurrentHashMap();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int, float) public
     * java.util.concurrent.ConcurrentHashMap(int,float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ConcurrentHashMap_int_float()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentHashMap sut = null; // = new ConcurrentHashMap(int, float);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(int, float, int) public
     * java.util.concurrent.ConcurrentHashMap(int,float,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ConcurrentHashMap_int_float_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentHashMap sut = null; // = new ConcurrentHashMap(int, float, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.ConcurrentHashMap#ConcurrentHashMap(java.util.Map) public
     * java.util.concurrent.ConcurrentHashMap(java.util.Map<? extends K, ? extends V>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_ConcurrentHashMap_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConcurrentHashMap sut = null; // = new ConcurrentHashMap(java.util.Map);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.concurrent.ConcurrentHashMap#newKeySet()
     * public static <K> java.util.concurrent.ConcurrentHashMap.java.util.concurrent.ConcurrentHashMap$KeySetView<K,
     * java.lang.Boolean> java.util.concurrent.ConcurrentHashMap.newKeySet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newKeySet()
    throws Exception {
        // write some test for {@link java.util.concurrent.ConcurrentHashMap#newKeySet()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.concurrent.ConcurrentHashMap#newKeySet(int) public static <K>
     * java.util.concurrent.ConcurrentHashMap.java.util.concurrent.ConcurrentHashMap$KeySetView<K, java.lang.Boolean>
     * java.util.concurrent.ConcurrentHashMap.newKeySet(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newKeySet_int()
    throws Exception {
        // write some test for {@link java.util.concurrent.ConcurrentHashMap#newKeySet(int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ConcurrentHashMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ConcurrentHashMap]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link KeySetView} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.ConcurrentHashMapClassTests.KeySetViewClassTests}).
     */
    @SuppressWarnings("rawtypes")
    @RunWith(J8Unit4.class)
    public static class KeySetViewClassTest
    implements KeySetViewClassTests<KeySetView> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ConcurrentHashMap$KeySetView]

        @Override
        public Class<KeySetView> createNewSUT() {
            return KeySetView.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ConcurrentHashMap$KeySetView]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ConcurrentHashMap$KeySetView]

    }

}

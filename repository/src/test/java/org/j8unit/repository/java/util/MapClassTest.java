package org.j8unit.repository.java.util;

import java.util.Map;
import java.util.Map.Entry;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class MapClassTest
implements org.j8unit.repository.java.util.MapClassTests<Map> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Map]

    @Override
    public Class<Map> createNewSUT() {
        return Map.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Map]

    @SuppressWarnings("rawtypes")
    @RunWith(J8Unit4.class)
    public static class EntryClassTest
    implements org.j8unit.repository.java.util.MapClassTests.EntryClassTests<Entry> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Map$Entry]

        @Override
        public Class<Entry> createNewSUT() {
            return Entry.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.util.Map.Entry#comparingByKey(java.util.Comparator) public static
         * <K,V> java.util.Comparator<java.util.Map.java.util.Map$Entry<K, V>>
         * java.util.Map$Entry.comparingByKey(java.util.Comparator<? super K>)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_comparingByKey_Comparator()
        throws Exception {
            // write some test for {@link java.util.Map.Entry#comparingByKey(java.util.Comparator)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.util.Map.Entry#comparingByKey() public
         * static <K,V> java.util.Comparator<java.util.Map.java.util.Map$Entry<K, V>>
         * java.util.Map$Entry.comparingByKey()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_comparingByKey()
        throws Exception {
            // write some test for {@link java.util.Map.Entry#comparingByKey()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.util.Map.Entry#comparingByValue() public
         * static <K,V> java.util.Comparator<java.util.Map.java.util.Map$Entry<K, V>>
         * java.util.Map$Entry.comparingByValue()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_comparingByValue()
        throws Exception {
            // write some test for {@link java.util.Map.Entry#comparingByValue()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.util.Map.Entry#comparingByValue(java.util.Comparator) public static
         * <K,V> java.util.Comparator<java.util.Map.java.util.Map$Entry<K, V>>
         * java.util.Map$Entry.comparingByValue(java.util.Comparator<? super V>)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_comparingByValue_Comparator()
        throws Exception {
            // write some test for {@link java.util.Map.Entry#comparingByValue(java.util.Comparator)}
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Map$Entry]

    }

}

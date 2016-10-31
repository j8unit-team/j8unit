package org.j8unit.repository.java.util;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractMapClassTest
implements org.j8unit.repository.java.util.AbstractMapClassTests<AbstractMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractMap]

    @Override
    public Class<AbstractMap> createNewSUT() {
        return AbstractMap.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.AbstractMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractMap]

    @SuppressWarnings("rawtypes")
    @RunWith(J8Unit4.class)
    public static class SimpleImmutableEntryClassTest
    implements org.j8unit.repository.java.util.AbstractMapClassTests.SimpleImmutableEntryClassTests<SimpleImmutableEntry> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractMap$SimpleImmutableEntry]

        @Override
        public Class<SimpleImmutableEntry> createNewSUT() {
            return SimpleImmutableEntry.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.AbstractMap.SimpleImmutableEntry#SimpleImmutableEntry(Object, Object) public
         * java.util.AbstractMap$SimpleImmutableEntry(K,V)}.
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
        public void create_SimpleImmutableEntry_Object_Object()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final SimpleImmutableEntry sut = null; // = new SimpleImmutableEntry(Object, Object);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.AbstractMap.SimpleImmutableEntry#SimpleImmutableEntry(java.util.Map.Entry) public
         * java.util.AbstractMap$SimpleImmutableEntry(java.util.Map.java.util.Map$Entry<? extends K, ? extends V>)}.
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
        public void create_SimpleImmutableEntry_Entry()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final SimpleImmutableEntry sut = null; // = new SimpleImmutableEntry(java.util.Map.Entry);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.AbstractMap$SimpleImmutableEntry]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractMap$SimpleImmutableEntry]

    }

    @SuppressWarnings("rawtypes")
    @RunWith(J8Unit4.class)
    public static class SimpleEntryClassTest
    implements org.j8unit.repository.java.util.AbstractMapClassTests.SimpleEntryClassTests<SimpleEntry> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractMap$SimpleEntry]

        @Override
        public Class<SimpleEntry> createNewSUT() {
            return SimpleEntry.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.AbstractMap.SimpleEntry#SimpleEntry(Object, Object) public
         * java.util.AbstractMap$SimpleEntry(K,V)}.
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
        public void create_SimpleEntry_Object_Object()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final SimpleEntry sut = null; // = new SimpleEntry(Object, Object);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link java.util.AbstractMap.SimpleEntry#SimpleEntry(java.util.Map.Entry) public
         * java.util.AbstractMap$SimpleEntry(java.util.Map.java.util.Map$Entry<? extends K, ? extends V>)}.
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
        public void create_SimpleEntry_Entry()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final SimpleEntry sut = null; // = new SimpleEntry(java.util.Map.Entry);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.AbstractMap$SimpleEntry]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractMap$SimpleEntry]

    }

}

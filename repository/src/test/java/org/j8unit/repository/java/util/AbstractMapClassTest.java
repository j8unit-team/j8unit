package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AbstractMapClassTest
implements org.j8unit.repository.java.util.AbstractMapClassTests<java.util.AbstractMap> {

    @Override
    public Class<java.util.AbstractMap> createNewSUT() {
        return java.util.AbstractMap.class;
    }

    @RunWith(J8Unit4.class)
    @SuppressWarnings("rawtypes")
    public static class SimpleEntryClassTest
    implements org.j8unit.repository.java.util.AbstractMapClassTests.SimpleEntryClassTests<java.util.AbstractMap.SimpleEntry> {

        @Override
        public Class<java.util.AbstractMap.SimpleEntry> createNewSUT() {
            return java.util.AbstractMap.SimpleEntry.class;
        }

    }

    @RunWith(J8Unit4.class)
    @SuppressWarnings("rawtypes")
    public static class SimpleImmutableEntryClassTest
    implements org.j8unit.repository.java.util.AbstractMapClassTests.SimpleImmutableEntryClassTests<java.util.AbstractMap.SimpleImmutableEntry> {

        @Override
        public Class<java.util.AbstractMap.SimpleImmutableEntry> createNewSUT() {
            return java.util.AbstractMap.SimpleImmutableEntry.class;
        }

    }

}

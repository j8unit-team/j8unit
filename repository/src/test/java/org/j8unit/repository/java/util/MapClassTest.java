package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class MapClassTest
implements org.j8unit.repository.java.util.MapClassTests<java.util.Map> {

    @RunWith(J8Unit4.class)
    @SuppressWarnings("rawtypes")
    public static class EntryClassTest
    implements org.j8unit.repository.java.util.MapClassTests.EntryClassTests<java.util.Map.Entry> {

        @Override
        public Class<java.util.Map.Entry> createNewSUT() {
            return java.util.Map.Entry.class;
        }

    }

    @Override
    public Class<java.util.Map> createNewSUT() {
        return java.util.Map.class;
    }

}

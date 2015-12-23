package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ConcurrentHashMapClassTest
implements org.j8unit.repository.java.util.concurrent.ConcurrentHashMapClassTests<java.util.concurrent.ConcurrentHashMap> {

    @Override
    public Class<java.util.concurrent.ConcurrentHashMap> createNewSUT() {
        return java.util.concurrent.ConcurrentHashMap.class;
    }

    @RunWith(J8Unit4.class)
    @SuppressWarnings("rawtypes")
    public static class KeySetViewClassTest
    implements org.j8unit.repository.java.util.concurrent.ConcurrentHashMapClassTests.KeySetViewClassTests<java.util.concurrent.ConcurrentHashMap.KeySetView> {

        @Override
        public Class<java.util.concurrent.ConcurrentHashMap.KeySetView> createNewSUT() {
            return java.util.concurrent.ConcurrentHashMap.KeySetView.class;
        }

    }

}

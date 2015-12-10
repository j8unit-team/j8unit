package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SortedSetClassTest
implements org.j8unit.repository.java.util.SortedSetClassTests<java.util.SortedSet> {

    @Override
    public Class<java.util.SortedSet> createNewSUT() {
        return java.util.SortedSet.class;
    }

}

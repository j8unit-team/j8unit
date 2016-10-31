package org.j8unit.repository.java.util;

import java.util.SortedSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SortedSetClassTest
implements org.j8unit.repository.java.util.SortedSetClassTests<SortedSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.SortedSet]

    @Override
    public Class<SortedSet> createNewSUT() {
        return SortedSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.SortedSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.SortedSet]

}

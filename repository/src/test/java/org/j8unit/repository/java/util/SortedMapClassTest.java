package org.j8unit.repository.java.util;

import java.util.SortedMap;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SortedMapClassTest
implements org.j8unit.repository.java.util.SortedMapClassTests<SortedMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.SortedMap]

    @Override
    public Class<SortedMap> createNewSUT() {
        return SortedMap.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.SortedMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.SortedMap]

}

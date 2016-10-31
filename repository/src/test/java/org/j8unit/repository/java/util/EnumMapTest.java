package org.j8unit.repository.java.util;

import java.util.EnumMap;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EnumMapTest<K extends Enum<K>, V>
implements org.j8unit.repository.java.util.EnumMapTests<EnumMap<K, V>, K, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.EnumMap]

    @Override
    public EnumMap<K, V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.EnumMap], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.EnumMap]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.EnumMap]

}

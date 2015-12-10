package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class EnumMapClassTest
implements org.j8unit.repository.java.util.EnumMapClassTests<java.util.EnumMap> {

    @Override
    public Class<java.util.EnumMap> createNewSUT() {
        return java.util.EnumMap.class;
    }

}

package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class EnumSetClassTest
implements org.j8unit.repository.java.util.EnumSetClassTests<java.util.EnumSet> {

    @Override
    public Class<java.util.EnumSet> createNewSUT() {
        return java.util.EnumSet.class;
    }

}

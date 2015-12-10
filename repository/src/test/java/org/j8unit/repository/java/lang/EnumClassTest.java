package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class EnumClassTest
implements org.j8unit.repository.java.lang.EnumClassTests<java.lang.Enum> {

    @Override
    public Class<java.lang.Enum> createNewSUT() {
        return java.lang.Enum.class;
    }

}

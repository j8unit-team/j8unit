package org.j8unit.repository.java.util;

import java.util.Enumeration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class EnumerationClassTest
implements org.j8unit.repository.java.util.EnumerationClassTests<Enumeration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Enumeration]

    @Override
    public Class<Enumeration> createNewSUT() {
        return Enumeration.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Enumeration]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Enumeration]

}

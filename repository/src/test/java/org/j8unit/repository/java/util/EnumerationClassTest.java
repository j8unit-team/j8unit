package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class EnumerationClassTest
implements org.j8unit.repository.java.util.EnumerationClassTests<java.util.Enumeration> {

    @Override
    public Class<java.util.Enumeration> createNewSUT() {
        return java.util.Enumeration.class;
    }

}

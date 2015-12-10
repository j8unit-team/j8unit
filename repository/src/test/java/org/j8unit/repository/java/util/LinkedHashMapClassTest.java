package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class LinkedHashMapClassTest
implements org.j8unit.repository.java.util.LinkedHashMapClassTests<java.util.LinkedHashMap> {

    @Override
    public Class<java.util.LinkedHashMap> createNewSUT() {
        return java.util.LinkedHashMap.class;
    }

}

package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ArrayListClassTest
implements org.j8unit.repository.java.util.ArrayListClassTests<java.util.ArrayList> {

    @Override
    public Class<java.util.ArrayList> createNewSUT() {
        return java.util.ArrayList.class;
    }

}

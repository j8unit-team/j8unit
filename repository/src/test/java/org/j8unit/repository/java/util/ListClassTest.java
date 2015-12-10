package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ListClassTest
implements org.j8unit.repository.java.util.ListClassTests<java.util.List> {

    @Override
    public Class<java.util.List> createNewSUT() {
        return java.util.List.class;
    }

}

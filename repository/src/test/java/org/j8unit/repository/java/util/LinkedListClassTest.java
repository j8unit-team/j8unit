package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class LinkedListClassTest
implements org.j8unit.repository.java.util.LinkedListClassTests<java.util.LinkedList> {

    @Override
    public Class<java.util.LinkedList> createNewSUT() {
        return java.util.LinkedList.class;
    }

}

package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ListIteratorClassTest
implements org.j8unit.repository.java.util.ListIteratorClassTests<java.util.ListIterator> {

    @Override
    public Class<java.util.ListIterator> createNewSUT() {
        return java.util.ListIterator.class;
    }

}

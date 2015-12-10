package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class IteratorClassTest
implements org.j8unit.repository.java.util.IteratorClassTests<java.util.Iterator> {

    @Override
    public Class<java.util.Iterator> createNewSUT() {
        return java.util.Iterator.class;
    }

}

package org.j8unit.repository.java.util;

import java.util.Iterator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class IteratorClassTest
implements org.j8unit.repository.java.util.IteratorClassTests<Iterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Iterator]

    @Override
    public Class<Iterator> createNewSUT() {
        return Iterator.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Iterator]

}

package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class IterableClassTest
implements org.j8unit.repository.java.lang.IterableClassTests<Iterable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Iterable]

    @Override
    public Class<Iterable> createNewSUT() {
        return Iterable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Iterable]

}

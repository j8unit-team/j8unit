package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class IterableClassTest
implements org.j8unit.repository.java.lang.IterableClassTests<java.lang.Iterable> {

    @Override
    public Class<java.lang.Iterable> createNewSUT() {
        return java.lang.Iterable.class;
    }

}

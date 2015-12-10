package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ComparatorClassTest
implements org.j8unit.repository.java.util.ComparatorClassTests<java.util.Comparator> {

    @Override
    public Class<java.util.Comparator> createNewSUT() {
        return java.util.Comparator.class;
    }

}

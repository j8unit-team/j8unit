package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RandomAccessClassTest
implements org.j8unit.repository.java.util.RandomAccessClassTests<java.util.RandomAccess> {

    @Override
    public Class<java.util.RandomAccess> createNewSUT() {
        return java.util.RandomAccess.class;
    }

}

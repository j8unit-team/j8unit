package org.j8unit.repository.java.util;

import java.util.RandomAccess;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RandomAccessClassTest
implements org.j8unit.repository.java.util.RandomAccessClassTests<RandomAccess> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.RandomAccess]

    @Override
    public Class<RandomAccess> createNewSUT() {
        return RandomAccess.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.RandomAccess]

}

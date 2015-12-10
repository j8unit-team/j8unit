package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BitSetClassTest
implements org.j8unit.repository.java.util.BitSetClassTests<java.util.BitSet> {

    @Override
    public Class<java.util.BitSet> createNewSUT() {
        return java.util.BitSet.class;
    }

}

package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OptionalIntClassTest
implements org.j8unit.repository.java.util.OptionalIntClassTests<java.util.OptionalInt> {

    @Override
    public Class<java.util.OptionalInt> createNewSUT() {
        return java.util.OptionalInt.class;
    }

}

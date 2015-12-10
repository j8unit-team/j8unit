package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SplittableRandomClassTest
implements org.j8unit.repository.java.util.SplittableRandomClassTests<java.util.SplittableRandom> {

    @Override
    public Class<java.util.SplittableRandom> createNewSUT() {
        return java.util.SplittableRandom.class;
    }

}

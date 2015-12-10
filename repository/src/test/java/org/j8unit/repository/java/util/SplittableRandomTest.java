package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SplittableRandomTest
implements org.j8unit.repository.java.util.SplittableRandomTests<java.util.SplittableRandom> {

    @Override
    public java.util.SplittableRandom createNewSUT() {
        return new java.util.SplittableRandom();
    }

}

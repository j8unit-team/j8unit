package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RandomTest
implements org.j8unit.repository.java.util.RandomTests<java.util.Random> {

    @Override
    public java.util.Random createNewSUT() {
        return new java.util.Random();
    }

}

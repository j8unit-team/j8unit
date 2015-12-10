package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleAdderClassTest
implements org.j8unit.repository.java.util.concurrent.atomic.DoubleAdderClassTests<java.util.concurrent.atomic.DoubleAdder> {

    @Override
    public Class<java.util.concurrent.atomic.DoubleAdder> createNewSUT() {
        return java.util.concurrent.atomic.DoubleAdder.class;
    }

}

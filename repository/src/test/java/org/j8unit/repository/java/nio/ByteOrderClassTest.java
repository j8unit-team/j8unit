package org.j8unit.repository.java.nio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteOrderClassTest
implements org.j8unit.repository.java.nio.ByteOrderClassTests<java.nio.ByteOrder> {

    @Override
    public Class<java.nio.ByteOrder> createNewSUT() {
        return java.nio.ByteOrder.class;
    }

}

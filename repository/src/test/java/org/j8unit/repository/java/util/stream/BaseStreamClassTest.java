package org.j8unit.repository.java.util.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class BaseStreamClassTest
implements org.j8unit.repository.java.util.stream.BaseStreamClassTests<java.util.stream.BaseStream> {

    @Override
    public Class<java.util.stream.BaseStream> createNewSUT() {
        return java.util.stream.BaseStream.class;
    }

}

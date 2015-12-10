package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectOutputClassTest
implements org.j8unit.repository.java.io.ObjectOutputClassTests<java.io.ObjectOutput> {

    @Override
    public Class<java.io.ObjectOutput> createNewSUT() {
        return java.io.ObjectOutput.class;
    }

}

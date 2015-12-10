package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExternalizableClassTest
implements org.j8unit.repository.java.io.ExternalizableClassTests<java.io.Externalizable> {

    @Override
    public Class<java.io.Externalizable> createNewSUT() {
        return java.io.Externalizable.class;
    }

}

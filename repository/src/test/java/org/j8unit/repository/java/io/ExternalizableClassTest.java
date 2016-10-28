package org.j8unit.repository.java.io;

import java.io.Externalizable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExternalizableClassTest
implements org.j8unit.repository.java.io.ExternalizableClassTests<Externalizable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.Externalizable]

    @Override
    public Class<Externalizable> createNewSUT() {
        return Externalizable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.Externalizable]

}

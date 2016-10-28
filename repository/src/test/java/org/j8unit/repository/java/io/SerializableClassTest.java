package org.j8unit.repository.java.io;

import java.io.Serializable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerializableClassTest
implements org.j8unit.repository.java.io.SerializableClassTests<Serializable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.Serializable]

    @Override
    public Class<Serializable> createNewSUT() {
        return Serializable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.Serializable]

}

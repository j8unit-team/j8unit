package org.j8unit.repository.java.io;

import java.io.ObjectInput;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectInputClassTest
implements org.j8unit.repository.java.io.ObjectInputClassTests<ObjectInput> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ObjectInput]

    @Override
    public Class<ObjectInput> createNewSUT() {
        return ObjectInput.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.ObjectInput]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ObjectInput]

}

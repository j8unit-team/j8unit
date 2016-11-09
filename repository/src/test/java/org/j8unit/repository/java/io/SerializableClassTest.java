package org.j8unit.repository.java.io;

import java.io.Serializable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Serializable} (by simply reusing the
 * J8Unit test interface {@link SerializableClassTests}).
 */

@RunWith(J8Unit4.class)
public class SerializableClassTest
implements SerializableClassTests<Serializable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.Serializable]

    @Override
    public Class<Serializable> createNewSUT() {
        return Serializable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.Serializable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.Serializable]

}

package org.j8unit.repository.java.io;

import java.io.Externalizable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Externalizable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.ExternalizableClassTests}).
 */

@RunWith(J8Unit4.class)
public class ExternalizableClassTest
implements ExternalizableClassTests<Externalizable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.Externalizable]

    @Override
    public Class<Externalizable> createNewSUT() {
        return Externalizable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.Externalizable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.Externalizable]

}

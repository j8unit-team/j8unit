package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Constructor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Constructor} (by simply reusing the
 * J8Unit test interface {@link ConstructorClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConstructorClassTest
implements ConstructorClassTests<Constructor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Constructor]

    @Override
    public Class<Constructor> createNewSUT() {
        return Constructor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.Constructor]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Constructor]

}

package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Type;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Type} (by simply reusing the J8Unit test
 * interface {@link TypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class TypeClassTest
implements TypeClassTests<Type> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Type]

    @Override
    public Class<Type> createNewSUT() {
        return Type.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.Type]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Type]

}

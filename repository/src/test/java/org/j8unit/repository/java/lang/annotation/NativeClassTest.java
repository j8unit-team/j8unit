package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Native;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Native} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.annotation.NativeClassTests}).
 */
@RunWith(J8Unit4.class)
public class NativeClassTest
implements NativeClassTests<Native> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.Native]

    @Override
    public Class<Native> createNewSUT() {
        return Native.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.annotation.Native]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.Native]

}

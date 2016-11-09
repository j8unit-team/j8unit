package org.j8unit.repository.javax.annotation;

import javax.annotation.Generated;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Generated} (by simply reusing the J8Unit
 * test interface {@link GeneratedClassTests}).
 */

@RunWith(J8Unit4.class)
public class GeneratedClassTest
implements GeneratedClassTests<Generated> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.Generated]

    @Override
    public Class<Generated> createNewSUT() {
        return Generated.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.Generated]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.Generated]

}

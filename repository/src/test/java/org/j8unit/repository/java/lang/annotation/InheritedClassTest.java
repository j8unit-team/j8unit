package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Inherited;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Inherited} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.annotation.InheritedClassTests}).
 */

@RunWith(J8Unit4.class)
public class InheritedClassTest
implements InheritedClassTests<Inherited> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.Inherited]

    @Override
    public Class<Inherited> createNewSUT() {
        return Inherited.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.annotation.Inherited]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.Inherited]

}

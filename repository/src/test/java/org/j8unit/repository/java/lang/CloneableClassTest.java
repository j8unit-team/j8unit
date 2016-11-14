package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Cloneable} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.CloneableClassTests}).
 */

@RunWith(J8Unit4.class)
public class CloneableClassTest
implements CloneableClassTests<Cloneable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Cloneable]

    @Override
    public Class<Cloneable> createNewSUT() {
        return Cloneable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Cloneable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Cloneable]

}

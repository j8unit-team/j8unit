package org.j8unit.repository.java.util;

import java.util.Set;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Set} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.util.SetClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SetClassTest
implements SetClassTests<Set> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Set]

    @Override
    public Class<Set> createNewSUT() {
        return Set.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Set]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Set]

}

package org.j8unit.repository.java.beans;

import java.beans.Visibility;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Visibility} (by simply reusing the J8Unit
 * test interface {@link VisibilityClassTests}).
 */

@RunWith(J8Unit4.class)
public class VisibilityClassTest
implements VisibilityClassTests<Visibility> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.Visibility]

    @Override
    public Class<Visibility> createNewSUT() {
        return Visibility.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.Visibility]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.Visibility]

}

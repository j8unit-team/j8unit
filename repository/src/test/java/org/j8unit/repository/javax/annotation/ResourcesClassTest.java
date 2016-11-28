package org.j8unit.repository.javax.annotation;

import javax.annotation.Resources;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Resources} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.annotation.ResourcesClassTests}).
 */
@RunWith(J8Unit4.class)
public class ResourcesClassTest
implements ResourcesClassTests<Resources> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.Resources]

    @Override
    public Class<Resources> createNewSUT() {
        return Resources.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.Resources]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.Resources]

}

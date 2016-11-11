package org.j8unit.repository.java.beans;

import java.beans.ConstructorProperties;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ConstructorProperties} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.beans.ConstructorPropertiesClassTests}).
 */

@RunWith(J8Unit4.class)
public class ConstructorPropertiesClassTest
implements ConstructorPropertiesClassTests<ConstructorProperties> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.ConstructorProperties]

    @Override
    public Class<ConstructorProperties> createNewSUT() {
        return ConstructorProperties.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.ConstructorProperties]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.ConstructorProperties]

}

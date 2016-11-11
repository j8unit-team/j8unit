package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClassValue} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.ClassValueClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ClassValueClassTest
implements ClassValueClassTests<ClassValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ClassValue]

    @Override
    public Class<ClassValue> createNewSUT() {
        return ClassValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ClassValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ClassValue]

}

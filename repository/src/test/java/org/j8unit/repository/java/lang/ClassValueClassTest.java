package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ClassValueClassTest
implements org.j8unit.repository.java.lang.ClassValueClassTests<ClassValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ClassValue]

    @Override
    public Class<ClassValue> createNewSUT() {
        return ClassValue.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ClassValue]

}

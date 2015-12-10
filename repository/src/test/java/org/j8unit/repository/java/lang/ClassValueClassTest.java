package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ClassValueClassTest
implements org.j8unit.repository.java.lang.ClassValueClassTests<java.lang.ClassValue> {

    @Override
    public Class<java.lang.ClassValue> createNewSUT() {
        return java.lang.ClassValue.class;
    }

}

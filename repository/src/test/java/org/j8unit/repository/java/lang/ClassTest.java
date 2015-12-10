package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassTest<T>
implements org.j8unit.repository.java.lang.ClassTests<java.lang.Class<T>, T> {

    @Override
    public java.lang.Class<T> createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.lang.Class] available.");
    }

}

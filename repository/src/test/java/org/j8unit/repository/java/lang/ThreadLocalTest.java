package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadLocalTest<T>
implements org.j8unit.repository.java.lang.ThreadLocalTests<java.lang.ThreadLocal<T>, T> {

    @Override
    public java.lang.ThreadLocal<T> createNewSUT() {
        return new java.lang.ThreadLocal<>();
    }

}

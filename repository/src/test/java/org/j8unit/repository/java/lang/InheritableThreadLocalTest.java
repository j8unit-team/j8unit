package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InheritableThreadLocalTest<T>
implements org.j8unit.repository.java.lang.InheritableThreadLocalTests<java.lang.InheritableThreadLocal<T>, T> {

    @Override
    public java.lang.InheritableThreadLocal<T> createNewSUT() {
        return new java.lang.InheritableThreadLocal<>();
    }

}

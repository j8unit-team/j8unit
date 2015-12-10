package org.j8unit.repository.java.lang.ref;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SoftReferenceTest<T>
implements org.j8unit.repository.java.lang.ref.SoftReferenceTests<java.lang.ref.SoftReference<T>, T> {

    @Override
    public java.lang.ref.SoftReference<T> createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.lang.ref.SoftReference] available.");
    }

}

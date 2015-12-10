package org.j8unit.repository.java.lang.ref;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WeakReferenceTest<T>
implements org.j8unit.repository.java.lang.ref.WeakReferenceTests<java.lang.ref.WeakReference<T>, T> {

    @Override
    public java.lang.ref.WeakReference<T> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.ref.WeakReference] available.");
    }

}

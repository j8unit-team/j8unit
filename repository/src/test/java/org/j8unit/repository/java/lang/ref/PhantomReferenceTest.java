package org.j8unit.repository.java.lang.ref;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PhantomReferenceTest<T>
implements org.j8unit.repository.java.lang.ref.PhantomReferenceTests<java.lang.ref.PhantomReference<T>, T> {

    @Override
    public java.lang.ref.PhantomReference<T> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.ref.PhantomReference] available.");
    }

}

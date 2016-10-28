package org.j8unit.repository.java.lang.ref;

import java.lang.ref.SoftReference;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SoftReferenceTest<T>
implements org.j8unit.repository.java.lang.ref.SoftReferenceTests<SoftReference<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ref.SoftReference]

    @Override
    public SoftReference<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.ref.SoftReference], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ref.SoftReference]

}

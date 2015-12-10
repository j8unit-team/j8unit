package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayTypeTest<T>
implements org.j8unit.repository.javax.management.openmbean.ArrayTypeTests<javax.management.openmbean.ArrayType<T>, T> {

    @Override
    public javax.management.openmbean.ArrayType<T> createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.openmbean.ArrayType] available.");
    }

}

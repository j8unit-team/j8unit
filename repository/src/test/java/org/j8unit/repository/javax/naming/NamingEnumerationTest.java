package org.j8unit.repository.javax.naming;

import javax.naming.NamingEnumeration;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingEnumerationTest<T>
implements org.j8unit.repository.javax.naming.NamingEnumerationTests<NamingEnumeration<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.NamingEnumeration]

    @Override
    public NamingEnumeration<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.NamingEnumeration], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.NamingEnumeration]

}

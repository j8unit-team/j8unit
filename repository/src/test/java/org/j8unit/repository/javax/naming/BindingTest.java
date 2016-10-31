package org.j8unit.repository.javax.naming;

import javax.naming.Binding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingTest
implements org.j8unit.repository.javax.naming.BindingTests<Binding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.Binding]

    @Override
    public Binding createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.Binding], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.Binding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.Binding]

}

package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingTest
implements org.j8unit.repository.javax.naming.BindingTests<javax.naming.Binding> {

    @Override
    public javax.naming.Binding createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.naming.Binding] available.");
    }

}

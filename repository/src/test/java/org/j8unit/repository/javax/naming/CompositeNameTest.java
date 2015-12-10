package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeNameTest
implements org.j8unit.repository.javax.naming.CompositeNameTests<javax.naming.CompositeName> {

    @Override
    public javax.naming.CompositeName createNewSUT() {
        return new javax.naming.CompositeName();
    }

}

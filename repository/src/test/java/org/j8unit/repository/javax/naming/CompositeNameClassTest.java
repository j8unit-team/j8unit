package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeNameClassTest
implements org.j8unit.repository.javax.naming.CompositeNameClassTests<javax.naming.CompositeName> {

    @Override
    public Class<javax.naming.CompositeName> createNewSUT() {
        return javax.naming.CompositeName.class;
    }

}

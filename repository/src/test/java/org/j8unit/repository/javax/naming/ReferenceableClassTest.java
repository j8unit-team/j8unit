package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferenceableClassTest
implements org.j8unit.repository.javax.naming.ReferenceableClassTests<javax.naming.Referenceable> {

    @Override
    public Class<javax.naming.Referenceable> createNewSUT() {
        return javax.naming.Referenceable.class;
    }

}

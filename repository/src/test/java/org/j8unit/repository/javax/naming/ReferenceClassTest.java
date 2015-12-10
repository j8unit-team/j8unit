package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferenceClassTest
implements org.j8unit.repository.javax.naming.ReferenceClassTests<javax.naming.Reference> {

    @Override
    public Class<javax.naming.Reference> createNewSUT() {
        return javax.naming.Reference.class;
    }

}

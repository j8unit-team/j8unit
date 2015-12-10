package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkRefClassTest
implements org.j8unit.repository.javax.naming.LinkRefClassTests<javax.naming.LinkRef> {

    @Override
    public Class<javax.naming.LinkRef> createNewSUT() {
        return javax.naming.LinkRef.class;
    }

}

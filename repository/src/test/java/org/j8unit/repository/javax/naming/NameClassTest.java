package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameClassTest
implements org.j8unit.repository.javax.naming.NameClassTests<javax.naming.Name> {

    @Override
    public Class<javax.naming.Name> createNewSUT() {
        return javax.naming.Name.class;
    }

}

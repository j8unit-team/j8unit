package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompoundNameClassTest
implements org.j8unit.repository.javax.naming.CompoundNameClassTests<javax.naming.CompoundName> {

    @Override
    public Class<javax.naming.CompoundName> createNewSUT() {
        return javax.naming.CompoundName.class;
    }

}

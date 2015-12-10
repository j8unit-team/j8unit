package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GSSManagerClassTest
implements org.j8unit.repository.org.ietf.jgss.GSSManagerClassTests<org.ietf.jgss.GSSManager> {

    @Override
    public Class<org.ietf.jgss.GSSManager> createNewSUT() {
        return org.ietf.jgss.GSSManager.class;
    }

}

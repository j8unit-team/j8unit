package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardConstantsClassTest
implements org.j8unit.repository.javax.net.ssl.StandardConstantsClassTests<javax.net.ssl.StandardConstants> {

    @Override
    public Class<javax.net.ssl.StandardConstants> createNewSUT() {
        return javax.net.ssl.StandardConstants.class;
    }

}

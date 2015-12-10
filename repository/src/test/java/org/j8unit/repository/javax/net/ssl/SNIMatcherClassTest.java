package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SNIMatcherClassTest
implements org.j8unit.repository.javax.net.ssl.SNIMatcherClassTests<javax.net.ssl.SNIMatcher> {

    @Override
    public Class<javax.net.ssl.SNIMatcher> createNewSUT() {
        return javax.net.ssl.SNIMatcher.class;
    }

}

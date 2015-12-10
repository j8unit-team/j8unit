package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLParametersTest
implements org.j8unit.repository.javax.net.ssl.SSLParametersTests<javax.net.ssl.SSLParameters> {

    @Override
    public javax.net.ssl.SSLParameters createNewSUT() {
        return new javax.net.ssl.SSLParameters();
    }

}

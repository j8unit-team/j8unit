package org.j8unit.repository.java.security.cert;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKIXRevocationCheckerClassTest
implements org.j8unit.repository.java.security.cert.PKIXRevocationCheckerClassTests<java.security.cert.PKIXRevocationChecker> {

    @Override
    public Class<java.security.cert.PKIXRevocationChecker> createNewSUT() {
        return java.security.cert.PKIXRevocationChecker.class;
    }

    @RunWith(J8Unit4.class)
    public static class OptionClassTest
    implements org.j8unit.repository.java.security.cert.PKIXRevocationCheckerClassTests.OptionClassTests<java.security.cert.PKIXRevocationChecker.Option> {

        @Override
        public Class<java.security.cert.PKIXRevocationChecker.Option> createNewSUT() {
            return java.security.cert.PKIXRevocationChecker.Option.class;
        }

    }

}

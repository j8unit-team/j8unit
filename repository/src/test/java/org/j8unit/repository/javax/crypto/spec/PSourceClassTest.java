package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PSourceClassTest
implements org.j8unit.repository.javax.crypto.spec.PSourceClassTests<javax.crypto.spec.PSource> {

    @Override
    public Class<javax.crypto.spec.PSource> createNewSUT() {
        return javax.crypto.spec.PSource.class;
    }

    @RunWith(J8Unit4.class)
    public static class PSpecifiedClassTest
    implements org.j8unit.repository.javax.crypto.spec.PSourceClassTests.PSpecifiedClassTests<javax.crypto.spec.PSource.PSpecified> {

        @Override
        public Class<javax.crypto.spec.PSource.PSpecified> createNewSUT() {
            return javax.crypto.spec.PSource.PSpecified.class;
        }

    }

}

package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PSourceTest
implements org.j8unit.repository.javax.crypto.spec.PSourceTests<javax.crypto.spec.PSource> {

    @RunWith(J8Unit4.class)
    public static class PSpecifiedTest
    implements org.j8unit.repository.javax.crypto.spec.PSourceTests.PSpecifiedTests<javax.crypto.spec.PSource.PSpecified> {

        @Override
        public javax.crypto.spec.PSource.PSpecified createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.crypto.spec.PSource.PSpecified] available.");
        }

    }

    @Override
    public javax.crypto.spec.PSource createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.crypto.spec.PSource] available.");
    }

}

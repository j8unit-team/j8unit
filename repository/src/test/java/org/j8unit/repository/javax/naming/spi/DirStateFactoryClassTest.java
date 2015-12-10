package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirStateFactoryClassTest
implements org.j8unit.repository.javax.naming.spi.DirStateFactoryClassTests<javax.naming.spi.DirStateFactory> {

    @RunWith(J8Unit4.class)
    public static class ResultClassTest
    implements org.j8unit.repository.javax.naming.spi.DirStateFactoryClassTests.ResultClassTests<javax.naming.spi.DirStateFactory.Result> {

        @Override
        public Class<javax.naming.spi.DirStateFactory.Result> createNewSUT() {
            return javax.naming.spi.DirStateFactory.Result.class;
        }

    }

    @Override
    public Class<javax.naming.spi.DirStateFactory> createNewSUT() {
        return javax.naming.spi.DirStateFactory.class;
    }

}

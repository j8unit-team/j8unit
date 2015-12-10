package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResolverClassTest
implements org.j8unit.repository.javax.naming.spi.ResolverClassTests<javax.naming.spi.Resolver> {

    @Override
    public Class<javax.naming.spi.Resolver> createNewSUT() {
        return javax.naming.spi.Resolver.class;
    }

}

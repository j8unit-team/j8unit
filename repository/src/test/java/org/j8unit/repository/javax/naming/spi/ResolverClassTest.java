package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.Resolver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResolverClassTest
implements org.j8unit.repository.javax.naming.spi.ResolverClassTests<Resolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.Resolver]

    @Override
    public Class<Resolver> createNewSUT() {
        return Resolver.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.Resolver]

}

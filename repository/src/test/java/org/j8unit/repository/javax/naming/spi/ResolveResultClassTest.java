package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResolveResultClassTest
implements org.j8unit.repository.javax.naming.spi.ResolveResultClassTests<javax.naming.spi.ResolveResult> {

    @Override
    public Class<javax.naming.spi.ResolveResult> createNewSUT() {
        return javax.naming.spi.ResolveResult.class;
    }

}

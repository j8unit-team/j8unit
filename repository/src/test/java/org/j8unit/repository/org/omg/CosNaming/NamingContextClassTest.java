package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContext;

@RunWith(J8Unit4.class)
public class NamingContextClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextClassTests<NamingContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContext]

    @Override
    public Class<NamingContext> createNewSUT() {
        return NamingContext.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContext]

}

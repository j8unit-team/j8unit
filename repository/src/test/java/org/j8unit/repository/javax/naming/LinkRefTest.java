package org.j8unit.repository.javax.naming;

import javax.naming.LinkRef;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkRefTest
implements org.j8unit.repository.javax.naming.LinkRefTests<LinkRef> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.LinkRef]

    @Override
    public LinkRef createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.LinkRef], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.LinkRef]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.LinkRef]

}

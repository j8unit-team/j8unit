package org.j8unit.repository.javax.naming;

import javax.naming.NameClassPair;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameClassPairTest
implements org.j8unit.repository.javax.naming.NameClassPairTests<NameClassPair> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.NameClassPair]

    @Override
    public NameClassPair createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.NameClassPair], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.NameClassPair]

}

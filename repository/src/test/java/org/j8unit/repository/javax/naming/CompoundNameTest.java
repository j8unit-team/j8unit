package org.j8unit.repository.javax.naming;

import javax.naming.CompoundName;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompoundNameTest
implements org.j8unit.repository.javax.naming.CompoundNameTests<CompoundName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.CompoundName]

    @Override
    public CompoundName createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.CompoundName], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.CompoundName]

}

package org.j8unit.repository.java.security;

import java.security.DomainCombiner;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DomainCombinerTest
implements org.j8unit.repository.java.security.DomainCombinerTests<DomainCombiner> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.DomainCombiner]

    @Override
    public DomainCombiner createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.DomainCombiner], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.DomainCombiner]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.DomainCombiner]

}

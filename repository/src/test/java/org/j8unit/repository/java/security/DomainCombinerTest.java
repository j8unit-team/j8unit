package org.j8unit.repository.java.security;

import java.security.DomainCombiner;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DomainCombiner} (by simply reusing
 * the J8Unit test interface {@link DomainCombinerTests}).
 */

@RunWith(J8Unit4.class)
public class DomainCombinerTest
implements DomainCombinerTests<DomainCombiner> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.DomainCombiner]

    @Override
    public DomainCombiner createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.DomainCombiner], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.DomainCombiner]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.DomainCombiner]

}

package org.j8unit.repository.javax.security.auth;

import javax.security.auth.SubjectDomainCombiner;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SubjectDomainCombiner} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.security.auth.SubjectDomainCombinerTests}).
 */
@RunWith(J8Unit4.class)
public class SubjectDomainCombinerTest
implements SubjectDomainCombinerTests<SubjectDomainCombiner> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.SubjectDomainCombiner]

    @Override
    public SubjectDomainCombiner createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.SubjectDomainCombiner], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.SubjectDomainCombiner]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.SubjectDomainCombiner]

}

package org.j8unit.repository.java.security;

import java.security.DomainCombiner;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DomainCombiner} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.DomainCombinerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DomainCombinerClassTest
implements DomainCombinerClassTests<DomainCombiner> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.DomainCombiner]

    @Override
    public Class<DomainCombiner> createNewSUT() {
        return DomainCombiner.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.DomainCombiner]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.DomainCombiner]

}

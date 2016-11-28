package org.j8unit.repository.javax.naming;

import javax.naming.Referenceable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Referenceable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.ReferenceableClassTests}).
 */
@RunWith(J8Unit4.class)
public class ReferenceableClassTest
implements ReferenceableClassTests<Referenceable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.Referenceable]

    @Override
    public Class<Referenceable> createNewSUT() {
        return Referenceable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.Referenceable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.Referenceable]

}

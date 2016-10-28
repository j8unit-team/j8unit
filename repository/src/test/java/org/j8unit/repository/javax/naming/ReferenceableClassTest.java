package org.j8unit.repository.javax.naming;

import javax.naming.Referenceable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferenceableClassTest
implements org.j8unit.repository.javax.naming.ReferenceableClassTests<Referenceable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.Referenceable]

    @Override
    public Class<Referenceable> createNewSUT() {
        return Referenceable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.Referenceable]

}

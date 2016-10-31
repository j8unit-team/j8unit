package org.j8unit.repository.java.lang.ref;

import java.lang.ref.Reference;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ReferenceClassTest
implements org.j8unit.repository.java.lang.ref.ReferenceClassTests<Reference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ref.Reference]

    @Override
    public Class<Reference> createNewSUT() {
        return Reference.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ref.Reference]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ref.Reference]

}

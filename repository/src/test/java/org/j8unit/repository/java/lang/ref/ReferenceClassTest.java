package org.j8unit.repository.java.lang.ref;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ReferenceClassTest
implements org.j8unit.repository.java.lang.ref.ReferenceClassTests<java.lang.ref.Reference> {

    @Override
    public Class<java.lang.ref.Reference> createNewSUT() {
        return java.lang.ref.Reference.class;
    }

}

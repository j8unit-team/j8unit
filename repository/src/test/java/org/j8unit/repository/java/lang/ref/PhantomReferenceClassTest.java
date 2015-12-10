package org.j8unit.repository.java.lang.ref;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class PhantomReferenceClassTest
implements org.j8unit.repository.java.lang.ref.PhantomReferenceClassTests<java.lang.ref.PhantomReference> {

    @Override
    public Class<java.lang.ref.PhantomReference> createNewSUT() {
        return java.lang.ref.PhantomReference.class;
    }

}

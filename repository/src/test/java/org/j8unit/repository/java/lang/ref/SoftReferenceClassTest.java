package org.j8unit.repository.java.lang.ref;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SoftReferenceClassTest
implements org.j8unit.repository.java.lang.ref.SoftReferenceClassTests<java.lang.ref.SoftReference> {

    @Override
    public Class<java.lang.ref.SoftReference> createNewSUT() {
        return java.lang.ref.SoftReference.class;
    }

}

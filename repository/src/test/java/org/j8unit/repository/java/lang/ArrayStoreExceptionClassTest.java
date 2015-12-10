package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArrayStoreExceptionClassTest
implements org.j8unit.repository.java.lang.ArrayStoreExceptionClassTests<java.lang.ArrayStoreException> {

    @Override
    public Class<java.lang.ArrayStoreException> createNewSUT() {
        return java.lang.ArrayStoreException.class;
    }

}

package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class IdentityHashMapClassTest
implements org.j8unit.repository.java.util.IdentityHashMapClassTests<java.util.IdentityHashMap> {

    @Override
    public Class<java.util.IdentityHashMap> createNewSUT() {
        return java.util.IdentityHashMap.class;
    }

}

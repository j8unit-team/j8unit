package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class HashtableClassTest
implements org.j8unit.repository.java.util.HashtableClassTests<java.util.Hashtable> {

    @Override
    public Class<java.util.Hashtable> createNewSUT() {
        return java.util.Hashtable.class;
    }

}

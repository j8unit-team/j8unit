package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class WeakHashMapClassTest
implements org.j8unit.repository.java.util.WeakHashMapClassTests<java.util.WeakHashMap> {

    @Override
    public Class<java.util.WeakHashMap> createNewSUT() {
        return java.util.WeakHashMap.class;
    }

}

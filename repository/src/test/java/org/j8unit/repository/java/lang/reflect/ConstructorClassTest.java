package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Constructor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ConstructorClassTest
implements org.j8unit.repository.java.lang.reflect.ConstructorClassTests<Constructor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Constructor]

    @Override
    public Class<Constructor> createNewSUT() {
        return Constructor.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Constructor]

}

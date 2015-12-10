package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutableClassTest
implements org.j8unit.repository.java.lang.reflect.ExecutableClassTests<java.lang.reflect.Executable> {

    @Override
    public Class<java.lang.reflect.Executable> createNewSUT() {
        return java.lang.reflect.Executable.class;
    }

}

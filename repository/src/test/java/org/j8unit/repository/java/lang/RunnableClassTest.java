package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RunnableClassTest
implements org.j8unit.repository.java.lang.RunnableClassTests<java.lang.Runnable> {

    @Override
    public Class<java.lang.Runnable> createNewSUT() {
        return java.lang.Runnable.class;
    }

}

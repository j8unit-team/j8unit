package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RunnableClassTest
implements org.j8unit.repository.java.lang.RunnableClassTests<Runnable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Runnable]

    @Override
    public Class<Runnable> createNewSUT() {
        return Runnable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Runnable]

}

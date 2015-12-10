package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExecutorsClassTest
implements org.j8unit.repository.java.util.concurrent.ExecutorsClassTests<java.util.concurrent.Executors> {

    @Override
    public Class<java.util.concurrent.Executors> createNewSUT() {
        return java.util.concurrent.Executors.class;
    }

}

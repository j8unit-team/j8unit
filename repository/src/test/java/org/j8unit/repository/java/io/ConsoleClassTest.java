package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConsoleClassTest
implements org.j8unit.repository.java.io.ConsoleClassTests<java.io.Console> {

    @Override
    public Class<java.io.Console> createNewSUT() {
        return java.io.Console.class;
    }

}

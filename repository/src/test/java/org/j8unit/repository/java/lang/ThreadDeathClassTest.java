package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadDeathClassTest
implements org.j8unit.repository.java.lang.ThreadDeathClassTests<java.lang.ThreadDeath> {

    @Override
    public Class<java.lang.ThreadDeath> createNewSUT() {
        return java.lang.ThreadDeath.class;
    }

}

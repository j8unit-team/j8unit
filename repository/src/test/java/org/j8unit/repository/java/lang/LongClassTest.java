package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LongClassTest
implements org.j8unit.repository.java.lang.LongClassTests<java.lang.Long> {

    @Override
    public Class<java.lang.Long> createNewSUT() {
        return java.lang.Long.class;
    }

}

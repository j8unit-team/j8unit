package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringJoinerClassTest
implements org.j8unit.repository.java.util.StringJoinerClassTests<java.util.StringJoiner> {

    @Override
    public Class<java.util.StringJoiner> createNewSUT() {
        return java.util.StringJoiner.class;
    }

}

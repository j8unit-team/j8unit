package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RepeatableClassTest
implements org.j8unit.repository.java.lang.annotation.RepeatableClassTests<java.lang.annotation.Repeatable> {

    @Override
    public Class<java.lang.annotation.Repeatable> createNewSUT() {
        return java.lang.annotation.Repeatable.class;
    }

}

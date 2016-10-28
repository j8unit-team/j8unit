package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Repeatable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RepeatableClassTest
implements org.j8unit.repository.java.lang.annotation.RepeatableClassTests<Repeatable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.Repeatable]

    @Override
    public Class<Repeatable> createNewSUT() {
        return Repeatable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.Repeatable]

}

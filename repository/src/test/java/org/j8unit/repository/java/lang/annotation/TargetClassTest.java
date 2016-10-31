package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Target;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TargetClassTest
implements org.j8unit.repository.java.lang.annotation.TargetClassTests<Target> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.Target]

    @Override
    public Class<Target> createNewSUT() {
        return Target.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.annotation.Target]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.Target]

}

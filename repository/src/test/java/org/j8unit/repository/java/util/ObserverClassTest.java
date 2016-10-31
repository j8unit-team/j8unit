package org.j8unit.repository.java.util;

import java.util.Observer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObserverClassTest
implements org.j8unit.repository.java.util.ObserverClassTests<Observer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Observer]

    @Override
    public Class<Observer> createNewSUT() {
        return Observer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Observer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Observer]

}

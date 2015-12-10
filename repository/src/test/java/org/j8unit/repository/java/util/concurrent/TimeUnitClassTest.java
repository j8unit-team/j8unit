package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeUnitClassTest
implements org.j8unit.repository.java.util.concurrent.TimeUnitClassTests<java.util.concurrent.TimeUnit> {

    @Override
    public Class<java.util.concurrent.TimeUnit> createNewSUT() {
        return java.util.concurrent.TimeUnit.class;
    }

}

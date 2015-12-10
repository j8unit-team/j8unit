package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class YearClassTest
implements org.j8unit.repository.java.time.YearClassTests<java.time.Year> {

    @Override
    public Class<java.time.Year> createNewSUT() {
        return java.time.Year.class;
    }

}

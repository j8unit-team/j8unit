package org.j8unit.repository.javax.xml.datatype;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DurationClassTest
implements org.j8unit.repository.javax.xml.datatype.DurationClassTests<javax.xml.datatype.Duration> {

    @Override
    public Class<javax.xml.datatype.Duration> createNewSUT() {
        return javax.xml.datatype.Duration.class;
    }

}

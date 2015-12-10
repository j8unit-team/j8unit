package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventFilterClassTest
implements org.j8unit.repository.javax.xml.stream.EventFilterClassTests<javax.xml.stream.EventFilter> {

    @Override
    public Class<javax.xml.stream.EventFilter> createNewSUT() {
        return javax.xml.stream.EventFilter.class;
    }

}

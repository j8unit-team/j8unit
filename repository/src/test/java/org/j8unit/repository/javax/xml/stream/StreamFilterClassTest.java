package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.StreamFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamFilterClassTest
implements org.j8unit.repository.javax.xml.stream.StreamFilterClassTests<StreamFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.StreamFilter]

    @Override
    public Class<StreamFilter> createNewSUT() {
        return StreamFilter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.StreamFilter]

}

package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.Source;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SourceClassTest
implements org.j8unit.repository.javax.xml.transform.SourceClassTests<Source> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.Source]

    @Override
    public Class<Source> createNewSUT() {
        return Source.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.Source]

}

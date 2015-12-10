package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SourceClassTest
implements org.j8unit.repository.javax.xml.transform.SourceClassTests<javax.xml.transform.Source> {

    @Override
    public Class<javax.xml.transform.Source> createNewSUT() {
        return javax.xml.transform.Source.class;
    }

}

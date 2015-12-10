package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemplatesClassTest
implements org.j8unit.repository.javax.xml.transform.TemplatesClassTests<javax.xml.transform.Templates> {

    @Override
    public Class<javax.xml.transform.Templates> createNewSUT() {
        return javax.xml.transform.Templates.class;
    }

}

package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameClassTest
implements org.j8unit.repository.javax.xml.soap.NameClassTests<javax.xml.soap.Name> {

    @Override
    public Class<javax.xml.soap.Name> createNewSUT() {
        return javax.xml.soap.Name.class;
    }

}

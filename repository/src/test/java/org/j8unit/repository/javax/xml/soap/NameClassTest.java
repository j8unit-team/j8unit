package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.Name;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameClassTest
implements org.j8unit.repository.javax.xml.soap.NameClassTests<Name> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.Name]

    @Override
    public Class<Name> createNewSUT() {
        return Name.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.Name]

}

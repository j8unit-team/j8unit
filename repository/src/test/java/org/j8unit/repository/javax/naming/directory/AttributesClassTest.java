package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.Attributes;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributesClassTest
implements org.j8unit.repository.javax.naming.directory.AttributesClassTests<Attributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.Attributes]

    @Override
    public Class<Attributes> createNewSUT() {
        return Attributes.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.Attributes]

}

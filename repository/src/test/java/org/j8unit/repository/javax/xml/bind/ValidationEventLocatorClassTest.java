package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.ValidationEventLocator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidationEventLocatorClassTest
implements org.j8unit.repository.javax.xml.bind.ValidationEventLocatorClassTests<ValidationEventLocator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.ValidationEventLocator]

    @Override
    public Class<ValidationEventLocator> createNewSUT() {
        return ValidationEventLocator.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.ValidationEventLocator]

}

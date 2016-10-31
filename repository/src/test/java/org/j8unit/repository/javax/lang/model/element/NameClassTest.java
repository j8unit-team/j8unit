package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.Name;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameClassTest
implements org.j8unit.repository.javax.lang.model.element.NameClassTests<Name> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.Name]

    @Override
    public Class<Name> createNewSUT() {
        return Name.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.element.Name]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.Name]

}

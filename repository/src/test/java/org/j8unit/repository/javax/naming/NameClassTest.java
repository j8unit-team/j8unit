package org.j8unit.repository.javax.naming;

import javax.naming.Name;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameClassTest
implements org.j8unit.repository.javax.naming.NameClassTests<Name> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.Name]

    @Override
    public Class<Name> createNewSUT() {
        return Name.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.Name]

}

package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameClassTest
implements org.j8unit.repository.javax.lang.model.element.NameClassTests<javax.lang.model.element.Name> {

    @Override
    public Class<javax.lang.model.element.Name> createNewSUT() {
        return javax.lang.model.element.Name.class;
    }

}

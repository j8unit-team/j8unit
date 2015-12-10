package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypesClassTest
implements org.j8unit.repository.java.sql.TypesClassTests<java.sql.Types> {

    @Override
    public Class<java.sql.Types> createNewSUT() {
        return java.sql.Types.class;
    }

}

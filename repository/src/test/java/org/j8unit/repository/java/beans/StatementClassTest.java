package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StatementClassTest
implements org.j8unit.repository.java.beans.StatementClassTests<java.beans.Statement> {

    @Override
    public Class<java.beans.Statement> createNewSUT() {
        return java.beans.Statement.class;
    }

}

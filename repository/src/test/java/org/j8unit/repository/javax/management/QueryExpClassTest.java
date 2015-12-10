package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QueryExpClassTest
implements org.j8unit.repository.javax.management.QueryExpClassTests<javax.management.QueryExp> {

    @Override
    public Class<javax.management.QueryExp> createNewSUT() {
        return javax.management.QueryExp.class;
    }

}

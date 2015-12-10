package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QueryTest
implements org.j8unit.repository.javax.management.QueryTests<javax.management.Query> {

    @Override
    public javax.management.Query createNewSUT() {
        return new javax.management.Query();
    }

}

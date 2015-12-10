package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QueryClassTest
implements org.j8unit.repository.javax.management.QueryClassTests<javax.management.Query> {

    @Override
    public Class<javax.management.Query> createNewSUT() {
        return javax.management.Query.class;
    }

}

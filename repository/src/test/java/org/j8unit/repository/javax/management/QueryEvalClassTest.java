package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class QueryEvalClassTest
implements org.j8unit.repository.javax.management.QueryEvalClassTests<javax.management.QueryEval> {

    @Override
    public Class<javax.management.QueryEval> createNewSUT() {
        return javax.management.QueryEval.class;
    }

}

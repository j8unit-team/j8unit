package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLDataSourceTest
implements org.j8unit.repository.javax.activation.URLDataSourceTests<javax.activation.URLDataSource> {

    @Override
    public javax.activation.URLDataSource createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.activation.URLDataSource] available.");
    }

}

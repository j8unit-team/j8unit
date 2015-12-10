package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileDataSourceTest
implements org.j8unit.repository.javax.activation.FileDataSourceTests<javax.activation.FileDataSource> {

    @Override
    public javax.activation.FileDataSource createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.activation.FileDataSource] available.");
    }

}

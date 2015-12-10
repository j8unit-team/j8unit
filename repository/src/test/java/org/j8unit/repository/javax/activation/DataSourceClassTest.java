package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataSourceClassTest
implements org.j8unit.repository.javax.activation.DataSourceClassTests<javax.activation.DataSource> {

    @Override
    public Class<javax.activation.DataSource> createNewSUT() {
        return javax.activation.DataSource.class;
    }

}

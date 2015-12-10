package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLDataSourceClassTest
implements org.j8unit.repository.javax.activation.URLDataSourceClassTests<javax.activation.URLDataSource> {

    @Override
    public Class<javax.activation.URLDataSource> createNewSUT() {
        return javax.activation.URLDataSource.class;
    }

}

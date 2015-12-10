package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileDataSourceClassTest
implements org.j8unit.repository.javax.activation.FileDataSourceClassTests<javax.activation.FileDataSource> {

    @Override
    public Class<javax.activation.FileDataSource> createNewSUT() {
        return javax.activation.FileDataSource.class;
    }

}

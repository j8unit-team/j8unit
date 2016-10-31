package org.j8unit.repository.javax.activation;

import javax.activation.DataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataSourceClassTest
implements org.j8unit.repository.javax.activation.DataSourceClassTests<DataSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.DataSource]

    @Override
    public Class<DataSource> createNewSUT() {
        return DataSource.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.DataSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.DataSource]

}

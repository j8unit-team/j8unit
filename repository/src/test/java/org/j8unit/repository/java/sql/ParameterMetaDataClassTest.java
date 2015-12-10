package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterMetaDataClassTest
implements org.j8unit.repository.java.sql.ParameterMetaDataClassTests<java.sql.ParameterMetaData> {

    @Override
    public Class<java.sql.ParameterMetaData> createNewSUT() {
        return java.sql.ParameterMetaData.class;
    }

}

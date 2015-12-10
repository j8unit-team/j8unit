package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PseudoColumnUsageClassTest
implements org.j8unit.repository.java.sql.PseudoColumnUsageClassTests<java.sql.PseudoColumnUsage> {

    @Override
    public Class<java.sql.PseudoColumnUsage> createNewSUT() {
        return java.sql.PseudoColumnUsage.class;
    }

}

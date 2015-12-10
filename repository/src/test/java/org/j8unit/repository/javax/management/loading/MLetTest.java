package org.j8unit.repository.javax.management.loading;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MLetTest
implements org.j8unit.repository.javax.management.loading.MLetTests<javax.management.loading.MLet> {

    @Override
    public javax.management.loading.MLet createNewSUT() {
        return new javax.management.loading.MLet();
    }

}

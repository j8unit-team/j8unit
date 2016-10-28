package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.CompositeDataView;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeDataViewClassTest
implements org.j8unit.repository.javax.management.openmbean.CompositeDataViewClassTests<CompositeDataView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.CompositeDataView]

    @Override
    public Class<CompositeDataView> createNewSUT() {
        return CompositeDataView.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.CompositeDataView]

}

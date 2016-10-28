package org.j8unit.repository.java.beans;

import java.beans.PropertyChangeListenerProxy;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyChangeListenerProxyTest
implements org.j8unit.repository.java.beans.PropertyChangeListenerProxyTests<PropertyChangeListenerProxy> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.PropertyChangeListenerProxy]

    @Override
    public PropertyChangeListenerProxy createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.PropertyChangeListenerProxy], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.PropertyChangeListenerProxy]

}

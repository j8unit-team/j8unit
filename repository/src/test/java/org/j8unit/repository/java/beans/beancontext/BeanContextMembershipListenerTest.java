package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextMembershipListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanContextMembershipListenerTest
implements org.j8unit.repository.java.beans.beancontext.BeanContextMembershipListenerTests<BeanContextMembershipListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextMembershipListener]

    @Override
    public BeanContextMembershipListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.beancontext.BeanContextMembershipListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextMembershipListener]

}

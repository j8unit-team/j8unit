package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LayoutFocusTraversalPolicyTest
implements org.j8unit.repository.javax.swing.LayoutFocusTraversalPolicyTests<javax.swing.LayoutFocusTraversalPolicy> {

    @Override
    public javax.swing.LayoutFocusTraversalPolicy createNewSUT() {
        return new javax.swing.LayoutFocusTraversalPolicy();
    }

}

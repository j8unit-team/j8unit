package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JEditorPaneTest
implements org.j8unit.repository.javax.swing.JEditorPaneTests<javax.swing.JEditorPane> {

    @Override
    public javax.swing.JEditorPane createNewSUT() {
        return new javax.swing.JEditorPane();
    }

}

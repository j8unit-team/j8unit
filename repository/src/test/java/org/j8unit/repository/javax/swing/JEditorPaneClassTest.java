package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JEditorPaneClassTest
implements org.j8unit.repository.javax.swing.JEditorPaneClassTests<javax.swing.JEditorPane> {

    @Override
    public Class<javax.swing.JEditorPane> createNewSUT() {
        return javax.swing.JEditorPane.class;
    }

}

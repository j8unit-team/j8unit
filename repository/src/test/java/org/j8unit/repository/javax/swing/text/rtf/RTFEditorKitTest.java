package org.j8unit.repository.javax.swing.text.rtf;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RTFEditorKitTest
implements org.j8unit.repository.javax.swing.text.rtf.RTFEditorKitTests<javax.swing.text.rtf.RTFEditorKit> {

    @Override
    public javax.swing.text.rtf.RTFEditorKit createNewSUT() {
        return new javax.swing.text.rtf.RTFEditorKit();
    }

}

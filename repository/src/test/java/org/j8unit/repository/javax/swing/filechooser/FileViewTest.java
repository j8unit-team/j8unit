package org.j8unit.repository.javax.swing.filechooser;

import javax.swing.filechooser.FileView;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileViewTest
implements org.j8unit.repository.javax.swing.filechooser.FileViewTests<FileView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.filechooser.FileView]

    @Override
    public FileView createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.filechooser.FileView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.filechooser.FileView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.filechooser.FileView]

}

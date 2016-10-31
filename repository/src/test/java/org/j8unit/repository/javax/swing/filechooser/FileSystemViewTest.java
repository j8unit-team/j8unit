package org.j8unit.repository.javax.swing.filechooser;

import javax.swing.filechooser.FileSystemView;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileSystemViewTest
implements org.j8unit.repository.javax.swing.filechooser.FileSystemViewTests<FileSystemView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.filechooser.FileSystemView]

    @Override
    public FileSystemView createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.filechooser.FileSystemView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.filechooser.FileSystemView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.filechooser.FileSystemView]

}

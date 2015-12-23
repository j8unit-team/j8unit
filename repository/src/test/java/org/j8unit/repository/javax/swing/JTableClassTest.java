package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTableClassTest
implements org.j8unit.repository.javax.swing.JTableClassTests<javax.swing.JTable> {

    @Override
    public Class<javax.swing.JTable> createNewSUT() {
        return javax.swing.JTable.class;
    }

    @RunWith(J8Unit4.class)
    public static class DropLocationClassTest
    implements org.j8unit.repository.javax.swing.JTableClassTests.DropLocationClassTests<javax.swing.JTable.DropLocation> {

        @Override
        public Class<javax.swing.JTable.DropLocation> createNewSUT() {
            return javax.swing.JTable.DropLocation.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class PrintModeClassTest
    implements org.j8unit.repository.javax.swing.JTableClassTests.PrintModeClassTests<javax.swing.JTable.PrintMode> {

        @Override
        public Class<javax.swing.JTable.PrintMode> createNewSUT() {
            return javax.swing.JTable.PrintMode.class;
        }

    }

}

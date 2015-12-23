package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableViewClassTest
implements org.j8unit.repository.javax.swing.text.TableViewClassTests<javax.swing.text.TableView> {

    @Override
    public Class<javax.swing.text.TableView> createNewSUT() {
        return javax.swing.text.TableView.class;
    }

    @RunWith(J8Unit4.class)
    public static class TableRowClassTest
    implements org.j8unit.repository.javax.swing.text.TableViewClassTests.TableRowClassTests<javax.swing.text.TableView.TableRow> {

        @Override
        public Class<javax.swing.text.TableView.TableRow> createNewSUT() {
            return javax.swing.text.TableView.TableRow.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class TableCellClassTest
    implements org.j8unit.repository.javax.swing.text.TableViewClassTests.TableCellClassTests<javax.swing.text.TableView.TableCell> {

        @Override
        public Class<javax.swing.text.TableView.TableCell> createNewSUT() {
            return javax.swing.text.TableView.TableCell.class;
        }

    }

}

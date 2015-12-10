package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SearchResultClassTest
implements org.j8unit.repository.javax.naming.directory.SearchResultClassTests<javax.naming.directory.SearchResult> {

    @Override
    public Class<javax.naming.directory.SearchResult> createNewSUT() {
        return javax.naming.directory.SearchResult.class;
    }

}

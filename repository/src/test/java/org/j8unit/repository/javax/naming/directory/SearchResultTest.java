package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.SearchResult;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SearchResultTest
implements org.j8unit.repository.javax.naming.directory.SearchResultTests<SearchResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.SearchResult]

    @Override
    public SearchResult createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.directory.SearchResult], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.SearchResult]

}

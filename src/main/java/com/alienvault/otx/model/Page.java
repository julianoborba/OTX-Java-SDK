package com.alienvault.otx.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URI;
import java.util.List;

/**
 * A Page of results
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Page<T> {
    private Integer count;
    private URI next;
    private URI previous;
    private List<T> results;

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public URI getNext() {
        return next;
    }

    public void setNext(URI nextURI) {
        this.next = nextURI;
    }

    public URI getPrevious() {
        return previous;
    }

    public void setPrevious(URI previousURI) {
        this.previous = previousURI;
    }

}

package org.kudytech.query.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the CONF_QUERY database table.
 *
 */
@Entity
@Table(name = "CONF_QUERY")
public class ConfQuery implements Serializable {

    private static final long serialVersionUID = 1L;
    private String queryName;
    private String query1;
    private String query2;

    public ConfQuery() {
    }

    @Id
    @Column(name = "QUERY_NAME")
    public String getQueryName() {
        return this.queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    @Column(name = "QUERY_1")
    public String getQuery1() {
        return this.query1;
    }

    public void setQuery1(String query1) {
        this.query1 = query1;
    }

    @Column(name = "QUERY_2")
    public String getQuery2() {
        return this.query2;
    }

    public void setQuery2(String query2) {
        this.query2 = query2;
    }
}
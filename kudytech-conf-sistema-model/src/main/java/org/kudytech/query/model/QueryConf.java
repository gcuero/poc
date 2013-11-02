package org.kudytech.query.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the QUERY_CONF database table.
 *
 */
@Entity
@Table(name = "QUERY_CONF")
public class QueryConf implements Serializable {

    private static final long serialVersionUID = 1L;
    private String query;
    private String queryName;
    private String queryType;
    private String query2;
    private TableConf tableConf;

    public QueryConf() {
    }

    public String getQuery() {
        return this.query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Id
    @Column(name = "QUERY_NAME", insertable = false)
    public String getQueryName() {
        return this.queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    @Column(name = "QUERY_TYPE")
    public String getQueryType() {
        return this.queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQuery2() {
        return this.query2;
    }

    public void setQuery2(String query2) {
        this.query2 = query2;
    }

    //uni-directional many-to-one association to TableConf
    @ManyToOne
    @JoinColumn(name = "TABLE_NAME")
    public TableConf getTableConf() {
        return this.tableConf;
    }

    public void setTableConf(TableConf tableConf) {
        this.tableConf = tableConf;
    }
}
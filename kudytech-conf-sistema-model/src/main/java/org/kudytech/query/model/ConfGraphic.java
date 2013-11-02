package org.kudytech.query.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the CONF_GRAPHICS database table.
 *
 */
@Entity
@Table(name = "CONF_GRAPHICS")
public class ConfGraphic implements Serializable {

    private static final long serialVersionUID = 1L;
    private String queryName;
    private String columnXAlias;
    private String columnXStatement;
    private String columnYAlias;
    private String columnYStatement;
    private String label;
    private String descripcion;
    private Boolean estatus;
    private QueryConf queryConf;

    public ConfGraphic() {
    }

    @Id
    @Column(name = "QUERY_NAME")
    public String getQueryName() {
        return this.queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    @Column(name = "COLUMN_X_ALIAS")
    public String getColumnXAlias() {
        return this.columnXAlias;
    }

    public void setColumnXAlias(String columnXAlias) {
        this.columnXAlias = columnXAlias;
    }

    @Column(name = "COLUMN_X_STATEMENT")
    public String getColumnXStatement() {
        return this.columnXStatement;
    }

    public void setColumnXStatement(String columnXStatement) {
        this.columnXStatement = columnXStatement;
    }

    @Column(name = "COLUMN_Y_ALIAS")
    public String getColumnYAlias() {
        return this.columnYAlias;
    }

    public void setColumnYAlias(String columnYAlias) {
        this.columnYAlias = columnYAlias;
    }

    @Column(name = "COLUMN_Y_STATEMENT")
    public String getColumnYStatement() {
        return this.columnYStatement;
    }

    public void setColumnYStatement(String columnYStatement) {
        this.columnYStatement = columnYStatement;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    //uni-directional one-to-one association to QueryConf
    @OneToOne
    @JoinColumn(name = "QUERY_NAME")
    public QueryConf getQueryConf() {
        return this.queryConf;
    }

    public void setQueryConf(QueryConf queryConf) {
        this.queryConf = queryConf;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }
}
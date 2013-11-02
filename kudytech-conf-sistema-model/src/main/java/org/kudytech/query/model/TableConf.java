package org.kudytech.query.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the TABLE_CONF database table.
 *
 */
@Entity
@Table(name = "TABLE_CONF")
public class TableConf implements Serializable {

    private static final long serialVersionUID = 1L;
    private String tableName;
    private String entityAlias;
    private String entityClass;
    private String entityName;
    private String tableAlias;

    public TableConf() {
    }

    @Id
    @Column(name = "TABLE_NAME")
    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Column(name = "ENTITY_ALIAS")
    public String getEntityAlias() {
        return this.entityAlias;
    }

    public void setEntityAlias(String entityAlias) {
        this.entityAlias = entityAlias;
    }

    @Column(name = "ENTITY_CLASS")
    public String getEntityClass() {
        return this.entityClass;
    }

    public void setEntityClass(String entityClass) {
        this.entityClass = entityClass;
    }

    @Column(name = "ENTITY_NAME")
    public String getEntityName() {
        return this.entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Column(name = "TABLE_ALIAS")
    public String getTableAlias() {
        return this.tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }
}
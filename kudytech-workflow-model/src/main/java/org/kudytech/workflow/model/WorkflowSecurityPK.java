package org.kudytech.workflow.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the WORKFLOW_SECURITY database table.
 *
 */
@Embeddable
public class WorkflowSecurityPK implements Serializable {
    //default serial version id, required for serializable classes.

    private static final long serialVersionUID = 1L;
    private String idauthority;
    private long idworkflowConfig;

    public WorkflowSecurityPK() {
    }

    public String getIdauthority() {
        return this.idauthority;
    }

    public void setIdauthority(String idauthority) {
        this.idauthority = idauthority;
    }

    @Column(name = "IDWORKFLOW_CONFIG")
    public long getIdworkflowConfig() {
        return this.idworkflowConfig;
    }

    public void setIdworkflowConfig(long idworkflowConfig) {
        this.idworkflowConfig = idworkflowConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowSecurityPK)) {
            return false;
        }
        WorkflowSecurityPK castOther = (WorkflowSecurityPK) other;
        return this.idauthority.equals(castOther.idauthority)
                && (this.idworkflowConfig == castOther.idworkflowConfig);

    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.idauthority.hashCode();
        hash = hash * prime + ((int) (this.idworkflowConfig ^ (this.idworkflowConfig >>> 32)));

        return hash;
    }
}
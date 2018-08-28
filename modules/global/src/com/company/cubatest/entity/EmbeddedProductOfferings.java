package com.company.cubatest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import com.haulmont.cuba.core.global.DesignSupport;
import java.util.Date;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "EMBPO_ID"))
})
@Table(name = "EMBEDDED_PRODUCT_OFFERINGS")
@Entity(name = "cubatest$EmbeddedProductOfferings")
public class EmbeddedProductOfferings extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -3947179777837155822L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PARENT_PROF_ID")
    protected ProductOfferings parentProf;

    @Column(name = "ORDER_IDX")
    protected Integer orderIdx;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_FOR_DATE_FROM", nullable = false)
    protected Date validForDateFrom;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_FOR_DATE_TO", nullable = false)
    protected Date validForDateTo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CHILD_PROF_ID")
    protected ProductOfferings childProf;

    public ProductOfferings getParentProf() {
        return parentProf;
    }

    public void setParentProf(ProductOfferings parentProf) {
        this.parentProf = parentProf;
    }


    public ProductOfferings getChildProf() {
        return childProf;
    }

    public void setChildProf(ProductOfferings childProf) {
        this.childProf = childProf;
    }




    public void setOrderIdx(Integer orderIdx) {
        this.orderIdx = orderIdx;
    }

    public Integer getOrderIdx() {
        return orderIdx;
    }

    public void setValidForDateFrom(Date validForDateFrom) {
        this.validForDateFrom = validForDateFrom;
    }

    public Date getValidForDateFrom() {
        return validForDateFrom;
    }

    public void setValidForDateTo(Date validForDateTo) {
        this.validForDateTo = validForDateTo;
    }

    public Date getValidForDateTo() {
        return validForDateTo;
    }


}
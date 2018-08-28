package com.company.cubatest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.NamePattern;
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
        @AttributeOverride(name = "id", column = @Column(name = "PRSP_ID"))
})
@NamePattern("%s|name")
@Table(name = "PRODUCT_SPECIFICATIONS")
@Entity(name = "cubatest$ProductSpecifications")
public class ProductSpecifications extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 6571836455362003670L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_PRSP_ID")
    protected ProductSpecifications parentPrsp;

    @Column(name = "NAME")
    protected String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_FOR_DATE_FROM")
    protected Date validForDateFrom;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_FOR_DATE_TO")
    protected Date validForDateTo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLASS_CLASS_ID")
    protected Classes classClass;

    @Column(name = "VER_ID")
    protected Integer ver;

    public void setParentPrsp(ProductSpecifications parentPrsp) {
        this.parentPrsp = parentPrsp;
    }

    public ProductSpecifications getParentPrsp() {
        return parentPrsp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public void setClassClass(Classes classClass) {
        this.classClass = classClass;
    }

    public Classes getClassClass() {
        return classClass;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    public Integer getVer() {
        return ver;
    }


}
package com.company.cubatest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import com.haulmont.cuba.core.global.DesignSupport;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "PERMU_ID"))
})
@NamePattern("%s|name")
@Table(name = "PERIOD_MEASURE_UNITS")
@Entity(name = "cubatest$PeriodMeasureUnits")
public class PeriodMeasureUnits extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 4673255970715536486L;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "NAME")
    protected String name;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
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
        @AttributeOverride(name = "id", column = @Column(name = "MUNT_ID"))
})
@NamePattern("%s|name")
@Table(name = "MEASURE_UNITS")
@Entity(name = "cubatest$MeasureUnits")
public class MeasureUnits extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -6608673796286508257L;

    @Column(name = "NAME")
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
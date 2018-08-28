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
        @AttributeOverride(name = "id", column = @Column(name = "CLASS_ID"))
})
@NamePattern("%s|name")
@Table(name = "CLASSES")
@Entity(name = "cubatest$Classes")
public class Classes extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -1236489579573028173L;

    @Column(name = "NAME")
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
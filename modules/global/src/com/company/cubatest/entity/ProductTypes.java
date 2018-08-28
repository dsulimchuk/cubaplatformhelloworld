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
        @AttributeOverride(name = "id", column = @Column(name = "PRTP_ID"))
})
@NamePattern("%s|name")
@Table(name = "PRODUCT_TYPES")
@Entity(name = "cubatest$ProductTypes")
public class ProductTypes extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 4717249403258729125L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "ROLE_NAME")
    protected String roleName;

    @Column(name = "CHECK_BAL")
    protected Boolean checkBal;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setCheckBal(Boolean checkBal) {
        this.checkBal = checkBal;
    }

    public Boolean getCheckBal() {
        return checkBal;
    }


}
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

@DesignSupport("{'dbView':true,'imported':true,'generateDdl':false}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "PROF_ID"))
})
@NamePattern("%s|name")
@Table(name = "PRODUCT_OFFERINGS")
@Entity(name = "ProductOfferings")
public class ProductOfferings extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 4286435705585850573L;

    @Override
    public String getInstanceName() {
        return super.getInstanceName();
    }

    @Column(name = "CODE")
    protected String code;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_FOR_DATE_FROM")
    protected Date validForDateFrom;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALID_FOR_DATE_TO")
    protected Date validForDateTo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRCT_PRCT_ID")
    protected ProductCategories prctPrct;

    @Column(name = "TERM_PROD_DUR_LENGTH")
    protected Long termProdDurLength;

    @Column(name = "TERM_NUMB_OF_OCC")
    protected Long termNumbOfOcc;

    @Column(name = "TERM_OCC_PERIOD_LENGTH")
    protected Long termOccPeriodLength;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TERM_OCC_PERMU_ID")
    protected PeriodMeasureUnits termOccPermu;

    @Column(name = "TERM_MULT_OCC")
    protected Boolean termMultOcc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRLN_PRLN_ID")
    protected ProductLines prlnPrln;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRSP_PRSP_ID")
    protected ProductSpecifications prspPrsp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLASS_CLASS_ID")
    protected Classes classClass;

    @Temporal(TemporalType.DATE)
    @Column(name = "CHANGE_DATE")
    protected Date changeDate;

    @Column(name = "DUMMY")
    protected Boolean dummy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TERM_PROD_DUR_PERMU_ID")
    protected PeriodMeasureUnits termProdDurPermu;

    @Column(name = "BIS_OBJ_HASH", length = 64)
    protected String bisObjHash;

    @Temporal(TemporalType.DATE)
    @Column(name = "TERM_DUR_LIMIT_DATE", nullable = false)
    protected Date termDurLimitDate;

    @Column(name = "TERM_INT_REC_CHRGS_MGMT")
    protected Boolean termIntRecChrgsMgmt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRTP_PRTP_ID")
    protected ProductTypes prtpPrtp;

    @Column(name = "TERM_ABILITY_FOR_BLOCK")
    protected Boolean termAbilityForBlock;

    @Column(name = "VER_ID")
    protected Integer ver;

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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
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

    public void setPrctPrct(ProductCategories prctPrct) {
        this.prctPrct = prctPrct;
    }

    public ProductCategories getPrctPrct() {
        return prctPrct;
    }

    public void setTermProdDurLength(Long termProdDurLength) {
        this.termProdDurLength = termProdDurLength;
    }

    public Long getTermProdDurLength() {
        return termProdDurLength;
    }

    public void setTermNumbOfOcc(Long termNumbOfOcc) {
        this.termNumbOfOcc = termNumbOfOcc;
    }

    public Long getTermNumbOfOcc() {
        return termNumbOfOcc;
    }

    public void setTermOccPeriodLength(Long termOccPeriodLength) {
        this.termOccPeriodLength = termOccPeriodLength;
    }

    public Long getTermOccPeriodLength() {
        return termOccPeriodLength;
    }

    public void setTermOccPermu(PeriodMeasureUnits termOccPermu) {
        this.termOccPermu = termOccPermu;
    }

    public PeriodMeasureUnits getTermOccPermu() {
        return termOccPermu;
    }

    public void setTermMultOcc(Boolean termMultOcc) {
        this.termMultOcc = termMultOcc;
    }

    public Boolean getTermMultOcc() {
        return termMultOcc;
    }

    public void setPrlnPrln(ProductLines prlnPrln) {
        this.prlnPrln = prlnPrln;
    }

    public ProductLines getPrlnPrln() {
        return prlnPrln;
    }

    public void setPrspPrsp(ProductSpecifications prspPrsp) {
        this.prspPrsp = prspPrsp;
    }

    public ProductSpecifications getPrspPrsp() {
        return prspPrsp;
    }

    public void setClassClass(Classes classClass) {
        this.classClass = classClass;
    }

    public Classes getClassClass() {
        return classClass;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setDummy(Boolean dummy) {
        this.dummy = dummy;
    }

    public Boolean getDummy() {
        return dummy;
    }

    public void setTermProdDurPermu(PeriodMeasureUnits termProdDurPermu) {
        this.termProdDurPermu = termProdDurPermu;
    }

    public PeriodMeasureUnits getTermProdDurPermu() {
        return termProdDurPermu;
    }

    public void setBisObjHash(String bisObjHash) {
        this.bisObjHash = bisObjHash;
    }

    public String getBisObjHash() {
        return bisObjHash;
    }

    public void setTermDurLimitDate(Date termDurLimitDate) {
        this.termDurLimitDate = termDurLimitDate;
    }

    public Date getTermDurLimitDate() {
        return termDurLimitDate;
    }

    public void setTermIntRecChrgsMgmt(Boolean termIntRecChrgsMgmt) {
        this.termIntRecChrgsMgmt = termIntRecChrgsMgmt;
    }

    public Boolean getTermIntRecChrgsMgmt() {
        return termIntRecChrgsMgmt;
    }

    public void setPrtpPrtp(ProductTypes prtpPrtp) {
        this.prtpPrtp = prtpPrtp;
    }

    public ProductTypes getPrtpPrtp() {
        return prtpPrtp;
    }

    public void setTermAbilityForBlock(Boolean termAbilityForBlock) {
        this.termAbilityForBlock = termAbilityForBlock;
    }

    public Boolean getTermAbilityForBlock() {
        return termAbilityForBlock;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    public Integer getVer() {
        return ver;
    }


}
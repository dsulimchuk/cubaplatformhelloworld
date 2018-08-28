-- begin CUBATEST_PRODUCT_OFFERING
create table CUBATEST_PRODUCT_OFFERING (
    ID number(19),
    UUID varchar2(32),
    --
    CODE varchar2(255 char),
    NAME varchar2(255 char),
    CHARS_ID varchar2(32),
    --
    primary key (ID)
)^
-- end CUBATEST_PRODUCT_OFFERING
-- begin PRODUCT_OFFERINGS
create table PRODUCT_OFFERINGS (
    PROF_ID number(10),
    --
    CODE varchar2(255 char),
    NAME varchar2(255 char) not null,
    DESCRIPTION varchar2(255 char) not null,
    VALID_FOR_DATE_FROM date,
    VALID_FOR_DATE_TO date,
    PRCT_PRCT_ID number(10) not null,
    TERM_PROD_DUR_LENGTH number(19),
    TERM_NUMB_OF_OCC number(19),
    TERM_OCC_PERIOD_LENGTH number(19),
    TERM_OCC_PERMU_ID number(10),
    TERM_MULT_OCC char(1),
    PRLN_PRLN_ID number(10),
    PRSP_PRSP_ID number(10),
    CLASS_CLASS_ID number(10) not null,
    CHANGE_DATE date,
    DUMMY char(1),
    TERM_PROD_DUR_PERMU_ID number(10),
    BIS_OBJ_HASH varchar2(64 char),
    TERM_DUR_LIMIT_DATE date not null,
    TERM_INT_REC_CHRGS_MGMT char(1),
    PRTP_PRTP_ID number(10),
    TERM_ABILITY_FOR_BLOCK char(1),
    VER_ID number(10),
    --
    primary key (PROF_ID)
)^
-- end PRODUCT_OFFERINGS
-- begin PRODUCT_CATEGORIES
create table PRODUCT_CATEGORIES (
    PRCT_ID number(10),
    --
    NAME varchar2(255 char) not null,
    --
    primary key (PRCT_ID)
)^
-- end PRODUCT_CATEGORIES
-- begin PRODUCT_LINES
create table PRODUCT_LINES (
    PRLN_ID number(10),
    --
    NAME varchar2(255 char),
    --
    primary key (PRLN_ID)
)^
-- end PRODUCT_LINES
-- begin PRODUCT_SPECIFICATIONS
create table PRODUCT_SPECIFICATIONS (
    PRSP_ID number(10),
    --
    PARENT_PRSP_ID number(10),
    NAME varchar2(255 char),
    VALID_FOR_DATE_FROM date,
    VALID_FOR_DATE_TO date,
    CLASS_CLASS_ID number(10) not null,
    VER_ID number(10),
    --
    primary key (PRSP_ID)
)^
-- end PRODUCT_SPECIFICATIONS
-- begin PRODUCT_TYPES
create table PRODUCT_TYPES (
    PRTP_ID number(10),
    --
    NAME varchar2(255 char),
    ROLE_NAME varchar2(255 char),
    CHECK_BAL char(1),
    --
    primary key (PRTP_ID)
)^
-- end PRODUCT_TYPES
-- begin EMBEDDED_PRODUCT_OFFERINGS
create table EMBEDDED_PRODUCT_OFFERINGS (
    EMBPO_ID number(10),
    --
    PARENT_PROF_ID number(10) not null,
    ORDER_IDX number(10),
    VALID_FOR_DATE_FROM date not null,
    VALID_FOR_DATE_TO date not null,
    CHILD_PROF_ID number(10) not null,
    --
    primary key (EMBPO_ID)
)^
-- end EMBEDDED_PRODUCT_OFFERINGS
-- begin CLASSES
create table CLASSES (
    CLASS_ID number(10),
    --
    NAME varchar2(255 char),
    --
    primary key (CLASS_ID)
)^
-- end CLASSES
-- begin MEASURE_UNITS
create table MEASURE_UNITS (
    MUNT_ID number(10),
    --
    NAME varchar2(255 char),
    --
    primary key (MUNT_ID)
)^
-- end MEASURE_UNITS
-- begin PERIOD_MEASURE_UNITS
create table PERIOD_MEASURE_UNITS (
    PERMU_ID number(10),
    --
    CODE varchar2(255 char),
    NAME varchar2(255 char),
    --
    primary key (PERMU_ID)
)^
-- end PERIOD_MEASURE_UNITS

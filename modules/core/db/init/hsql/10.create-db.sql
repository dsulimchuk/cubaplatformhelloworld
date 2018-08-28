-- begin CUBATEST_PRODUCT_OFFERING
create table CUBATEST_PRODUCT_OFFERING (
    ID bigint not null,
    UUID varchar(36),
    --
    CODE varchar(255),
    NAME varchar(255),
    CHARS_ID varchar(36),
    --
    primary key (ID)
)^
-- end CUBATEST_PRODUCT_OFFERING

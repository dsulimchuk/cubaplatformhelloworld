-- begin CUBATEST_PRODUCT_OFFERING
alter table CUBATEST_PRODUCT_OFFERING add constraint FK_CUBATEST_PRODUCT_OFFERING_ON_CHARS foreign key (CHARS_ID) references SEC_ROLE(ID)^
create index IDX_CUBATEST_PRODUCT_OFFERING_ON_CHARS on CUBATEST_PRODUCT_OFFERING (CHARS_ID)^
create index IDX_CUBATEST_PRODUCT_OFFERING on CUBATEST_PRODUCT_OFFERING (NAME) ^
-- end CUBATEST_PRODUCT_OFFERING
create table ACT_RU_EVENT_SUBSCR (
    ID_ VARCHAR(128) not null,
    REV_ integer,
    EVENT_TYPE_ NVARCHAR2(255) not null,
    EVENT_NAME_ NVARCHAR2(255),
    EXECUTION_ID_ VARCHAR(128),
    PROC_INST_ID_ VARCHAR(128),
    ACTIVITY_ID_ VARCHAR(128),
    CONFIGURATION_ NVARCHAR2(255),
    CREATED_ TIMESTAMP(6) not null,
    PROC_DEF_ID_ VARCHAR(128),
    SUB_SCOPE_ID_ VARCHAR(128),
    SCOPE_ID_ VARCHAR(128),
    SCOPE_DEFINITION_ID_ VARCHAR(128),
    SCOPE_TYPE_ VARCHAR(128),
    LOCK_TIME_ TIMESTAMP(6),
    LOCK_OWNER_ NVARCHAR2(255),
    TENANT_ID_ NVARCHAR2(255) DEFAULT '',
    primary key (ID_)
);

create index ACT_IDX_EVENT_SUBSCR_CONFIG_ on ACT_RU_EVENT_SUBSCR(CONFIGURATION_);
create index ACT_IDX_EVENT_SUBSCR on ACT_RU_EVENT_SUBSCR(EXECUTION_ID_);
create index ACT_IDX_EVENT_SUBSCR_SCOPEREF_ on ACT_RU_EVENT_SUBSCR(SCOPE_ID_, SCOPE_TYPE_);

insert into ACT_GE_PROPERTY values ('eventsubscription.schema.version', '6.8.0.0', 1);

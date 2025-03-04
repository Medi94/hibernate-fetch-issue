create table invoice_position_group
(
    invoice_position_group_id     bigint generated by default as identity,
    parent_invoice_position_group bigint,
    group_id                      bigint,
    primary key (invoice_position_group_id)
);
create table invoice_position
(
    invoice_id                bigint not null,
    invoice_position_group_id bigint,
    position_number           bigint not null,
    primary key (invoice_id, position_number)
);
create table invoice_position_detail
(
    invoice_id                 bigint not null,
    invoice_position_detail_id bigint generated by default as identity,
    position_number            bigint not null,
    primary key (invoice_position_detail_id)
);
create table invoice_position_tax
(
    invoice_id              bigint not null,
    invoice_position_tax_id bigint not null,
    position_number         bigint not null,
    primary key (invoice_position_tax_id)
);
-- add the groups
insert into invoice_position_group (invoice_position_group_id, group_id) values
    (1, 1);

-- add the positions
insert into invoice_position (invoice_id, position_number, invoice_position_group_id) VALUES
    (42, 1, 1),
    (42, 2, 1);

-- add the details
-- we do not have any details in this scenario

--add the taxes
insert into invoice_position_tax (invoice_position_tax_id, position_number, invoice_id) VALUES
    (1, 1, 42),
    (2, 1, 42)
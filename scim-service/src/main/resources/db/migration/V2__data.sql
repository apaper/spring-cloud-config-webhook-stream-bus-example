--------- user type data -----------------------
INSERT INTO user_type (name, code) VALUES ('Contractor','CTR');
INSERT INTO user_type (name, code) VALUES ('Staff','STF');
INSERT INTO user_type (name, code) VALUES ('Detailee','DTL ');

--------- entitlement type data -----------------------
INSERT INTO entitlement_type (code, name) VALUES ('GRP','Group');
INSERT INTO entitlement_type (code, name) VALUES ('ROL','Role');
INSERT INTO entitlement_type (code, name) VALUES ('UIAS','UIAS Type');
INSERT INTO entitlement_type (code, name) VALUES ('TPC ','Topic');
INSERT INTO entitlement_type (code, name) VALUES ('RGN ','Region');

--------- organization data -----------------------
INSERT INTO organization (id, short_name, name) VALUES ('49f045f3-a2f9-46ca-a43a-cd500a8ca7ce','ORG1','Organization One');
INSERT INTO organization (id, short_name, name) VALUES ('bad1938a-b79a-4fe4-bfbf-ac78ccc7709b','ORG2','Organization Two');
INSERT INTO organization (id, short_name, name) VALUES ('83ac968d-27ac-4e9a-aeec-091cba49a8c1','ORG3','Organization Three');
INSERT INTO organization (id, short_name, name) VALUES ('72378f48-14a7-4e02-bef2-d3abb074461f','ORG4','Organization Four');

--------- entitlement data -----------------------
INSERT INTO entitlement (id, display_name, type_id, organization_id, is_active) VALUES ('d6385d4c-15dc-46b0-b38b-6287c5368c5d','Asia','5','72378f48-14a7-4e02-bef2-d3abb074461f','true');
INSERT INTO entitlement (id, display_name, type_id, organization_id, is_active) VALUES ('b362941b-5a9b-4b34-a537-87fbf0c11d23','Econonmics','4','72378f48-14a7-4e02-bef2-d3abb074461f','true');
INSERT INTO entitlement (id, display_name, type_id, organization_id, is_active) VALUES ('0af27d2e-4046-450f-9619-c560f18c376b','Group One','1','49f045f3-a2f9-46ca-a43a-cd500a8ca7ce','true');
INSERT INTO entitlement (id, display_name, type_id, organization_id, is_active) VALUES ('9aca6394-2a0f-4199-822c-dfc7ebf571b6','Group Two','1','83ac968d-27ac-4e9a-aeec-091cba49a8c1','true');
INSERT INTO entitlement (id, display_name, type_id, organization_id, is_active) VALUES ('017b4510-632d-4a8b-943f-fcff169430ed','Role One','2','72378f48-14a7-4e02-bef2-d3abb074461f','true');
INSERT INTO entitlement (id, display_name, type_id, organization_id, is_active) VALUES ('c8d75368-bdec-48b9-99e5-a4833e21e3ab','Role Two','2','72378f48-14a7-4e02-bef2-d3abb074461f','true');
INSERT INTO entitlement (id, display_name, type_id, organization_id, is_active) VALUES ('d6036dbf-216c-444e-831a-2c49022ba6ff','Role Three','2','83ac968d-27ac-4e9a-aeec-091cba49a8c1','false');
INSERT INTO entitlement (id, display_name, type_id, organization_id, is_active) VALUES ('25691741-43af-470e-9e75-f9bf6e3ed113','UIAS One','3','72378f48-14a7-4e02-bef2-d3abb074461f','true');

--------- user data -----------------------
INSERT INTO enduser (id, given_name, family_name, middle_name, external_id, user_type_id, is_active, create_date, modify_date) VALUES ('e19426c3-c478-46a3-8b09-b5ae7a0bb0af','Herman','Munster','Bolts','CN=Herman Munster B, OU=Gov, C=US',1,true,'2020-08-26 11:38:35', '2020-08-26 11:38:35');
INSERT INTO enduser (id, given_name, family_name, middle_name, external_id, user_type_id, is_active, create_date, modify_date) VALUES ('e105a4e6-e899-44b6-bafa-b27beca268f8','Frederick','Flinstone','Yabba Dabba','CN=Frederick Flinstone B, OU=Gov, C=US',2,true,'2020-08-26 11:38:35', '2020-08-26 11:38:35');
INSERT INTO enduser (id, given_name, family_name, middle_name, external_id, user_type_id, is_active, create_date, modify_date) VALUES ('07e17b98-668f-4a0b-b48b-ecfa4c8f6204','Eddie','Munster','Wolfgang','CN=Eddie Wolfgang B, OU=Gov, C=US',1,true,'2020-08-26 11:38:35', '2020-08-26 11:38:35');
INSERT INTO enduser (id, given_name, family_name, middle_name, external_id, user_type_id, is_active, create_date, modify_date) VALUES ('a3284808-6961-4be0-9197-dc034d4fbe66','Stephen','King','J','CN=Stephen King J, OU=Gov, C=US',2,false,'2020-08-26 11:38:35', '2020-08-26 11:38:35');
INSERT INTO enduser (id, given_name, family_name, middle_name, external_id, user_type_id, is_active, create_date, modify_date) VALUES ('39861cbc-99b8-45f8-bee9-2e2c9ea86226','Samuel','Jackson','P','CN=Samuel Jackson P, OU=Gov, C=US',1,false,'2020-08-26 11:38:35', '2020-08-26 11:38:35');
INSERT INTO enduser (id, given_name, family_name, middle_name, external_id, user_type_id, is_active, create_date, modify_date) VALUES ('c541ffc9-2411-49b0-a4fb-907ce05ff262','Barney','Rubble','Bam','CN=Barney Rubble B, OU=Gov, C=US',1,true,'2020-08-26 11:38:35', '2020-08-26 11:38:35');

--------- user security data -----------------------
INSERT INTO user_security_metadata (id, classification, primary_organization_id, create_date, modify_date, user_id) VALUES ('8823cee5-2340-48f1-a7ac-bdea8939d519','TS//SCI//NOFORN','83ac968d-27ac-4e9a-aeec-091cba49a8c1','2020-08-26 11:38:35', '2020-08-26 11:38:35', '07e17b98-668f-4a0b-b48b-ecfa4c8f6204');
INSERT INTO user_security_metadata (id, classification, primary_organization_id, create_date, modify_date, user_id) VALUES ('a7b38977-a5fc-48e0-a3fa-afe6d09bc87b','UNCLASSIFIED','bad1938a-b79a-4fe4-bfbf-ac78ccc7709b','2020-08-26 11:38:35', '2020-08-26 11:38:35', 'e105a4e6-e899-44b6-bafa-b27beca268f8');
INSERT INTO user_security_metadata (id, classification, primary_organization_id, create_date, modify_date, user_id) VALUES ('932145eb-b088-499b-8ace-5fb3321a7abc','TS//SCI//FVEY','bad1938a-b79a-4fe4-bfbf-ac78ccc7709b','2020-08-26 11:38:35', '2020-08-26 11:38:35', 'e105a4e6-e899-44b6-bafa-b27beca268f8');

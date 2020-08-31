
DROP TABLE IF EXISTS user_type;

CREATE TABLE user_type (
	id serial2 NOT NULL,
	name varchar(25) NOT NULL,
	code varchar(10) NOT NULL,
	CONSTRAINT user_type_pk PRIMARY KEY (id),
	CONSTRAINT user_type_name UNIQUE (name),
	CONSTRAINT user_type_code UNIQUE (code)
);

DROP TABLE IF EXISTS entitlement_type;
CREATE TABLE entitlement_type (
	id serial NOT NULL,
	code varchar(10) NOT NULL,
	name varchar(50) NOT NULL,
	CONSTRAINT entitlement_type_pk PRIMARY KEY (id),
	CONSTRAINT entitlement_type_code UNIQUE (code),
	CONSTRAINT entitlement_type_name UNIQUE ("name")
);


DROP TABLE IF EXISTS organization;
CREATE TABLE organization (
	id uuid NOT NULL,
	short_name varchar(30) NOT NULL,
	name varchar(75) NOT NULL,
	CONSTRAINT agency_lookup_pk PRIMARY KEY (id),
	CONSTRAINT agency_lookup_shortname UNIQUE (short_name),
	CONSTRAINT agency_lookup_name UNIQUE ("name")
);

DROP TABLE IF EXISTS entitlement;
CREATE TABLE entitlement (
	id uuid NOT NULL,
	display_name varchar(75) NOT NULL,
	type_id int NOT NULL,
	organization_id uuid NOT NULL,
	is_active boolean NOT NULL DEFAULT true,
	CONSTRAINT entitlement_pk PRIMARY KEY (id),
	CONSTRAINT entitlement_fk FOREIGN KEY (type_id) REFERENCES entitlement_type(id),
	CONSTRAINT entitlement_fk_1 FOREIGN KEY (organization_id) REFERENCES organization(id)
);

DROP TABLE IF EXISTS enduser;
CREATE TABLE enduser (
	id uuid NOT NULL,
	given_name varchar(75) NOT NULL,
	family_name varchar(75) NOT NULL,
	middle_name varchar(50) NOT NULL,
	external_id varchar(150) NOT NULL,
	user_type_id int NOT NULL,
	create_date timestamp NOT NULL,
	modify_date timestamp NOT NULL,
	is_active boolean NOT NULL DEFAULT true,
	CONSTRAINT user_pk PRIMARY KEY (id),
	CONSTRAINT user_fk FOREIGN KEY (user_type_id) REFERENCES user_type(id)
);

DROP TABLE IF EXISTS user_entitlements;
CREATE TABLE user_entitlements (
	user_id uuid NOT NULL,
	entitlement_id uuid NOT NULL,
	CONSTRAINT user_entitlement_fk FOREIGN KEY (user_id) REFERENCES enduser(id),
	CONSTRAINT entitlement_user_fk FOREIGN KEY (entitlement_id) REFERENCES entitlement(id)
);

DROP TABLE IF EXISTS organization_entitlements;
CREATE TABLE organization_entitlements (
	organization_id uuid NOT NULL,
	entitlement_id uuid NOT NULL,
	CONSTRAINT organization_entitlement_fk FOREIGN KEY (organization_id) REFERENCES organization(id),
	CONSTRAINT entitlement_user_fk FOREIGN KEY (entitlement_id) REFERENCES entitlement(id)
);

DROP TABLE IF EXISTS user_security_metadata;
CREATE TABLE user_security_metadata (
	id uuid NOT NULL,
	classification varchar(150) NOT NULL,
	user_id uuid NOT NULL,
	primary_organization_id uuid NOT NULL,
	create_date timestamp NOT NULL,
	modify_date timestamp NOT NULL,
	CONSTRAINT user_security_metadata_pk PRIMARY KEY (id),
	CONSTRAINT user_security_fk FOREIGN KEY (user_id) REFERENCES enduser(id),
	CONSTRAINT organization_security_fk FOREIGN KEY (primary_organization_id) REFERENCES organization(id)
);

DROP TABLE IF EXISTS user_security_metadata_secondary_organizations;
CREATE TABLE user_security_metadata_secondary_organizations (
	user_security_metadata_id uuid NOT NULL,
	organization_id uuid NOT NULL,
	CONSTRAINT user_security_md_organization_fk FOREIGN KEY (user_security_metadata_id) REFERENCES user_security_metadata(id),
	CONSTRAINT organization_user_fk FOREIGN KEY (organization_id) REFERENCES organization(id)
);

DROP TABLE IF EXISTS testtest.action;
DROP TABLE IF EXISTS testtest.activity;
DROP TABLE IF EXISTS testtest.assessed_gef_value_set;
DROP TABLE IF EXISTS testtest.assessment;
DROP TABLE IF EXISTS testtest.assessment_audience_role;
DROP TABLE IF EXISTS testtest.care_profile;
DROP TABLE IF EXISTS testtest.cd_data_source_type;
DROP TABLE IF EXISTS testtest.cd_detection_variable;
DROP TABLE IF EXISTS testtest.cd_detection_variable_type;
DROP TABLE IF EXISTS testtest.cd_pilot_detection_variable;
DROP TABLE IF EXISTS testtest.cd_role;
DROP TABLE IF EXISTS testtest.cd_typical_period;
DROP TABLE IF EXISTS testtest.cr_profile;
DROP TABLE IF EXISTS testtest.eam;
DROP TABLE IF EXISTS testtest.eam_startrange;
DROP TABLE IF EXISTS testtest.entity;
DROP TABLE IF EXISTS testtest.executed_action;
DROP TABLE IF EXISTS testtest.frailty_status_timeline;
DROP TABLE IF EXISTS testtest.geriatric_factor_value;
DROP TABLE IF EXISTS testtest.inter_activity_behaviour_variation;
DROP TABLE IF EXISTS testtest.location;
DROP TABLE IF EXISTS testtest.nui_gef;
DROP TABLE IF EXISTS testtest.numeric_indicator_value;
DROP TABLE IF EXISTS testtest.pilot;
DROP TABLE IF EXISTS testtest.simplelocation;
DROP TABLE IF EXISTS testtest.simplelocation_eam;
DROP TABLE IF EXISTS testtest.source_evidence;
DROP TABLE IF EXISTS testtest.startrange;
DROP TABLE IF EXISTS testtest.time_interval;
DROP TABLE IF EXISTS testtest.user_in_role;
DROP TABLE IF EXISTS testtest.user_in_system;
DROP TABLE IF EXISTS testtest.variation_measure_value;
DROP TABLE IF EXISTS testtest.cd_risk_status;
DROP TABLE IF EXISTS testtest.stakeholder;
DROP sequence IF EXISTS testtest.hibernate_sequence;
DROP sequence IF EXISTS testtest.assessment_id_seq;
create table testtest.action (id int8 not null, action_name varchar(50), category varchar(25), primary key (id));
create table testtest.activity (id int8 not null, activity_name varchar(50), user_in_role_id int8 not null, time_interval_id int8 not null, data_source_type varchar(3) not null, primary key (id));
create table testtest.assessed_gef_value_set (gef_value_id int4 not null, assessment_id int4 not null, detection_variable_type varchar(3) not null, data_point_id int8, primary key (gef_value_id, assessment_id));
create table testtest.assessment (id int8 not null, assessment_comment varchar(255), risk_status char(1), data_validity_status char(1), created timestamp not null, updated timestamp, author_id int8, primary key (id));
create table testtest.assessment_audience_role (assessment_id int8 not null, role_id int8 not null, assigned timestamp not null, primary key (assessment_id,role_id));
create table testtest.care_profile (user_in_role_id int4 not null, individual_summary varchar(255) not null, attention_status char(1), intervention_status char(1), last_intervention_date date, created timestamp not null, last_updated timestamp, created_by int8 not null, last_updated_by int8, primary key (user_in_role_id));
create table testtest.cd_data_source_type (data_source_type varchar(3) not null, data_source_type_description varchar(250) not null, primary key (data_source_type));
create table testtest.cd_detection_variable (id int8 not null, detection_variable_name varchar(100), detection_variable_type varchar(3), valid_from timestamp, valid_to timestamp, derived_detection_variable_id int2, derivation_weight numeric(3, 2), primary key (id));
create table testtest.cd_detection_variable_type (detection_variable_type varchar(3) not null, detection_variable_type_description varchar(50), primary key (detection_variable_type));
create table testtest.cd_frailty_status (frailty_status varchar(9) not null, frailty_status_description varchar(255), primary key (frailty_status));
create table testtest.cd_pilot_detection_variable (pilot_id int4 not null, detection_variable_id int2 not null, detection_variable_description_formula varchar(255) not null, primary key (pilot_id, detection_variable_id));
create table testtest.cd_role (id int8 not null, role_name varchar(50), role_abbreviation varchar(3), role_description varchar(200), valid_from timestamp, valid_to timestamp, stakeholder_abbreviation varchar(3), primary key (id));
create table testtest.cd_typical_period (typical_period varchar(3) not null, period_description varchar(50), typical_duration time, primary key (typical_period));
create table testtest.cr_profile (id int8 not null, ref_height float4, ref_weight float4, ref_mean_blood_pressure numeric(5, 2), date time, user_in_role_id int8 not null, birth_date date not null, gender bool not null, primary key (id));
create table testtest.eam (id int8 not null, duration int4, actionid int8 not null, activityid int8 not null, primary key (id));
create table testtest.executed_action (id int8 not null, date timestamp not null, locationid int8 not null, actionid int8 not null, activityid int8, userinroleid int8 not null, rating int4, sensor_id int4 not null, payload varchar(50) not null, extra_information varchar(255), primary key (id));
create table testtest.frailty_status_timeline (time_interval_id int8 not null, changed_by int8 not null, changed timestamp not null, user_in_role_id int8 not null, frailty_status varchar(9) not null, frailty_notice varchar(200), primary key (time_interval_id, changed_by));
create table testtest.geriatric_factor_value (id int8 not null, gef_value numeric(3, 2), time_interval_id int8, gef_type_id int8, user_in_role_id int4, data_source_type varchar(3), derivation_weight numeric(3, 2), primary key (id));
create table testtest.inter_activity_behaviour_variation (id int8 not null, deviation float4, expected_activity_id int8 not null, real_activity_id int8 not null, numeric_indicator_id int8 not null, primary key (id));
create table testtest.location (id int8 not null, location_name varchar(50), indoor int2, pilot_id int8 not null, primary key (id));
create table testtest.numeric_indicator_value (id int8 not null, nui_type_id int8 not null, nui_value numeric(10, 2) not null, time_interval_id int8 not null, data_source_type varchar(3) not null, user_in_role_id int8, variation_measure_id int8 not null, primary key (id));
create table testtest.pilot (id int8 not null, name varchar(50), pilot_code varchar(50), population_size float8, primary key (id));
create table testtest.source_evidence (geriatric_factor_id int4 not null, author_id int4 not null, text_evidence varchar(255), multimedia_evidence bytea, uploaded timestamp not null, primary key (geriatric_factor_id, author_id));
create table testtest.time_interval (id int8 not null, interval_start timestamp, interval_end timestamp, typical_period varchar(3), primary key (id));
create table testtest.user_in_role (id int8 not null, pilot_id int4, valid_from timestamp, valid_to timestamp, user_in_system_id int4, role_id int2, primary key (id));
create table testtest.user_in_system (id int8 not null, username varchar(25) unique, password varchar(25), created_date timestamp, display_name varchar(255), primary key (id));
create table testtest.variation_measure_value (id int8 not null, activity_id int8, user_in_role_id int8 not null, measure_value float4, measure_type_id int8 not null, data_source_type varchar(3) not null, time_interval_id int8 not null, primary key (id));
create table testtest.cd_risk_status (risk_status varchar(3) not null, risk_status_description varchar(50), confidence_rating numeric(3, 2), icon_image bytea, icon_image_path varchar(255), primary key (risk_status));
create table testtest.stakeholder (stakeholder_abbreviation varchar(3) not null, stakeholder_name varchar(50) not null, stakeholder_description varchar(50), valid_from timestamp not null, valid_to timestamp, primary key (stakeholder_abbreviation));
create sequence testtest.hibernate_sequence;
create sequence testtest.assessment_id_seq;
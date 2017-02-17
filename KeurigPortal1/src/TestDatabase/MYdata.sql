drop table K_LOGIN;
drop table K_ORGANISATION;
drop table  K_TYPE_TESTING;
drop table  K_PACKAGES;
drop table K_TESTING_TOOLS;
drop table K_ACTIVE_PROJECTS;
drop table K_EVENTS;
drop table K_KNOWLEDGE_REP;
drop table K_LEARNING_MON;
drop table K_APP_MON;
drop table K_STAR_MON;
drop table K_DOMAIN_AREAS;


CREATE TABLE K_LOGIN
( 
	email_id varchar(50) NOT NULL,
 	password varchar(100) NOT NULL,
 	
  	CONSTRAINT emailid_pk PRIMARY KEY (email_id)
);


insert into K_LOGIN values('harini@infy','harini1');
insert into K_LOGIN values('keurigportal','server');
insert into K_LOGIN values('sparshjain','sparsh');
insert into K_LOGIN values('virenderarneja','virender');

select * from K_LOGIN;

CREATE TABLE K_ORGANISATION(
              emp_id integer NOT NULL,
              role varchar(20) NOT NULL,
			  job_level integer NOT NULL,
			   
CONSTRAINT empid_pk PRIMARY KEY ( emp_id)
);

insert into K_ORGANISATION values(1,'DM',1);



CREATE TABLE K_TYPE_TESTING(
              
              test_type varchar(20) NOT NULL,
			  details varchar(50) NOT NULL,
			   
			  
CONSTRAINT test_type_pk PRIMARY KEY ( test_type)

);


insert into K_TYPE_TESTING values('functional','testing');
insert into K_TYPE_TESTING values('automation','testing');

CREATE TABLE K_DOMAIN_AREAS(
              
              domain_area varchar(20) NOT NULL,
			  details varchar(50) NOT NULL,
			   
CONSTRAINT domain_area_pk PRIMARY KEY ( domain_area)

);


insert into K_DOMAIN_AREAS values('abc','def');
insert into K_DOMAIN_AREAS values('uvw','xyz');


CREATE TABLE K_PACKAGES(
              
              package varchar(20) NOT NULL,
			  pdetails varchar(50) NOT NULL,
			   
CONSTRAINT package_pk PRIMARY KEY ( package)

);

insert into K_PACKAGES values('java','packages');
insert into K_PACKAGES values('C#','packages');


CREATE TABLE K_TESTING_TOOLS(
              
             tool varchar(20) NOT NULL,
			  tdetails varchar(50) NOT NULL,
			   
CONSTRAINT  tool_pk PRIMARY KEY (   tool)

);
insert into K_TESTING_TOOLS values('Selenium','Free tool');
insert into K_TESTING_TOOLS values('UFT','Licensed tool');

CREATE TABLE K_ACTIVE_PROJECTS(
              
              project varchar(20) NOT NULL,
			  requirements varchar(50) NOT NULL,
			   
CONSTRAINT   project_pk PRIMARY KEY (   project)

);

insert into K_ACTIVE_PROJECTS values('KEURIG Portal','JAVA');
insert into K_ACTIVE_PROJECTS values('Accelerate','Selenium');

CREATE TABLE K_EVENTS(
              
              eventid varchar(20) NOT NULL,
			  edetails varchar(50) NOT NULL,
			   
CONSTRAINT  eventid_pk PRIMARY KEY ( eventid)

);
insert into K_EVENTS values('Marathon','2k Masters');
insert into K_EVENTS values('Toastmasters','Every Thursday');

CREATE TABLE K_KNOWLEDGE_REP(
              
             knowledge varchar(20) NOT NULL,
			  kwDetails varchar(50) NOT NULL,
			   
CONSTRAINT kw_pk PRIMARY KEY (knowledge)

);


insert into K_KNOWLEDGE_REP values('Python','python');
insert into K_KNOWLEDGE_REP values('Java','java');

CREATE TABLE K_LEARNING_MON(
              
              learnMon varchar(20) NOT NULL,
			  lmDetails varchar(50) NOT NULL,
			   
CONSTRAINT   
              learnMon_pk PRIMARY KEY (  
              learnMon)

);

insert into K_LEARNING_MON values('JSP','Java Server Pages');
insert into K_LEARNING_MON values('Selenium','selenium');


CREATE TABLE K_APP_MON(
              
              appMonId varchar(20) NOT NULL,
			  apDetails varchar(50) NOT NULL,
			   
CONSTRAINT   appmonid_pk PRIMARY KEY (appMonId)

);

insert into K_APP_MON values('Alisha','712869');
insert into K_APP_MON values('virender','709710');


CREATE TABLE K_STAR_MON(
              
              strId varchar(20) NOT NULL,
			  details varchar(50) NOT NULL,
			   
CONSTRAINT   strid_pk PRIMARY KEY ( strId )

);

insert into K_STAR_MON values('harini','728367');

insert into K_STAR_MON values('Pranav','693118');
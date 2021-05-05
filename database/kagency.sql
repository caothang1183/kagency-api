DROP DATABASE kagency;
DROP USER sp_kagency;
CREATE USER sp_kagency  with password 'kagency';
CREATE DATABASE kagency with template=template0 owner=sp_kagency;
ALTER DEFAULT PRIVILEGES GRANT ALL ON tables to sp_kagency;
ALTER DEFAULT PRIVILEGES GRANT ALL ON sequences to sp_kagency;

CREATE TABLE IF NOT EXISTS "k_user" (
  "uuid" varchar(255) PRIMARY KEY NOT NULL,
  "role_id" int NOT NULL DEFAULT 0,
  "first_name" varchar(20) NOT NULL,
  "last_name" varchar(20) NOT NULL,
  "email" varchar(35) NOT NULL,
  "password" text NOT NULL,
  "activated" boolean DEFAULT false,
  "blocked" boolean DEFAULT false,
  "updated_at" timestamp,
  "created_at" timestamp DEFAULT (now())
);

CREATE TABLE IF NOT EXISTS "k_role" (
  "id" SERIAL UNIQUE PRIMARY KEY NOT NULL,
  "name" varchar(20),
  "description" text,
  "created_at" timestamp DEFAULT (now())
);

CREATE TABLE IF NOT EXISTS "k_task" (
  "uuid" varchar(255) PRIMARY KEY NOT NULL,
  "created_by" varchar(255) UNIQUE NOT NULL,
  "assigned_by" varchar(255) UNIQUE NOT NULL,
  "updated_by" varchar(255) UNIQUE NOT NULL,
  "watching_by" varchar(255) UNIQUE NOT NULL,
  "priority_id" int UNIQUE NOT NULL DEFAULT 0,
  "status_id" int UNIQUE NOT NULL DEFAULT 0,
  "title" varchar(150) NOT NULL,
  "description" text NOT NULL,
  "estimate_point" int DEFAULT 0,
  "deadline" date,
  "updated_at" timestamp,
  "created_at" timestamp DEFAULT (now())
);

CREATE TABLE IF NOT EXISTS "k_project" (
  "uuid" varchar(255) PRIMARY KEY NOT NULL,
  "created_by" varchar(255) UNIQUE NOT NULL,
  "updated_by" varchar(255) UNIQUE NOT NULL,
  "watching_by" varchar(255) UNIQUE NOT NULL,
  "task_id" varchar(255) UNIQUE NOT NULL,
  "name" varchar(35) NOT NULL,
  "description" text NOT NULL,
  "release_date" date,
  "updated_at" timestamp,
  "created_at" timestamp DEFAULT (now())
);

CREATE TABLE IF NOT EXISTS "k_priority" (
  "id" SERIAL UNIQUE PRIMARY KEY NOT NULL,
  "name" varchar(35) NOT NULL,
  "description" text
);

CREATE TABLE IF NOT EXISTS "k_status" (
  "id" SERIAL UNIQUE PRIMARY KEY NOT NULL,
  "name" varchar(35) NOT NULL,
  "description" text
);

ALTER TABLE "k_user" ADD CONSTRAINT "user_role_fk" FOREIGN KEY ("role_id") REFERENCES "k_role" ("id");

ALTER TABLE "k_priority" ADD FOREIGN KEY ("id") REFERENCES "k_task" ("priority_id");

ALTER TABLE "k_status" ADD FOREIGN KEY ("id") REFERENCES "k_task" ("status_id");

ALTER TABLE "k_user" ADD FOREIGN KEY ("uuid") REFERENCES "k_task" ("created_by");

ALTER TABLE "k_user" ADD FOREIGN KEY ("uuid") REFERENCES "k_task" ("assigned_by");

ALTER TABLE "k_user" ADD FOREIGN KEY ("uuid") REFERENCES "k_task" ("updated_by");

ALTER TABLE "k_user" ADD FOREIGN KEY ("uuid") REFERENCES "k_task" ("watching_by");

ALTER TABLE "k_task" ADD FOREIGN KEY ("uuid") REFERENCES "k_project" ("task_id");

ALTER TABLE "k_user" ADD FOREIGN KEY ("uuid") REFERENCES "k_project" ("created_by");

ALTER TABLE "k_user" ADD FOREIGN KEY ("uuid") REFERENCES "k_project" ("updated_by");

ALTER TABLE "k_user" ADD FOREIGN KEY ("uuid") REFERENCES "k_project" ("watching_by");
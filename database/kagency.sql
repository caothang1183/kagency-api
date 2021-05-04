CREATE TABLE IF NOT EXISTS k_role(
    role_id INTEGER PRIMARY KEY NOT NULL,
    role_name VARCHAR(20) NOT NULL,
    role_description TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS k_user(
    user_id INTEGER PRIMARY KEY NOT NULL,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    email VARCHAR(35) NOT NULL,
    password TEXT NOT NULL,
    activated BOOLEAN,
    deleted BOOLEAN,
    updated_at TIMESTAMP,
    created_at TIMESTAMP NOT NULL DEFAULT NOW(),
    role_id INTEGER,
	CONSTRAINT fk_role_user FOREIGN KEY (role_id) REFERENCES k_role(role_id) ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS k_task(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    completed BOOLEAN,
    created_by INTEGER NOT NULL,
	CONSTRAINT fk_user_task FOREIGN KEY (created_by) REFERENCES k_user(user_id) ON DELETE SET NULL,
    updated_at TIMESTAMP,
    created_at TIMESTAMP NOT NULL DEFAULT NOW()
);
CREATE TABLE IF NOT EXISTS role
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE CHECK (name ~ '^ROLE_')
);

-- 2. USERS LENTELĖ (spartūs paieškos indeksai, audit fields)
CREATE TABLE IF NOT EXISTS users
(
    id         BIGSERIAL PRIMARY KEY,
    username   VARCHAR(50)  NOT NULL UNIQUE,
    password   VARCHAR(100) NOT NULL,
    email      VARCHAR(100) NOT NULL UNIQUE,
    enabled    BOOLEAN   DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 3. USER_ROLES RYŠYS (kompozitinis PK, užsienio raktai su kaskadiniu trynimu)
CREATE TABLE IF NOT EXISTS user_roles
(
    user_id BIGINT NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    role_id BIGINT NOT NULL REFERENCES role (id) ON DELETE CASCADE,
    PRIMARY KEY (user_id, role_id)
);

-- 4. INDEKSAI (spartina dažniausias užklausas)
CREATE INDEX IF NOT EXISTS idx_users_username ON users (username);
CREATE INDEX IF NOT EXISTS idx_users_email ON users (email);
CREATE INDEX IF NOT EXISTS idx_user_roles_role ON user_roles (role_id);

-- 5. PRADINIAI DUOMENYS (saugu, idempotentiška)
INSERT INTO role (name)
VALUES ('ROLE_USER'),
       ('ROLE_ADMIN')
ON CONFLICT (name) DO NOTHING;
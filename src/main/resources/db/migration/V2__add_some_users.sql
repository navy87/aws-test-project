INSERT INTO users
    (id, name, email, password, created_at, profile_picture)
    VALUES
    (1, 'admin', 'admin@test.com', 'admin', '2020-01-01', NULL)
    ON CONFLICT DO NOTHING;

INSERT INTO users
    (id, name, email, password, created_at, profile_picture)
    VALUES
    (2, 'user', 'user@gmail.com', 'user', '2020-01-01', NULL)
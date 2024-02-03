INSERT INTO users
    (name, username, email, password, created_at, profile_picture)
    VALUES
    ('Administrator', 'admin', 'admin@test.com', 'admin', '2020-01-01', NULL)
    ON CONFLICT DO NOTHING;

INSERT INTO users
    (name, username, email, password, created_at, profile_picture)
    VALUES
    ('Yahya', 'yahya', 'yahya@gmail.com', 'user', '2020-01-01', NULL)
insert into users (name, username, password)
values('Daniil Sobolevski', 'danilsob2004@gmail.com', '$2a$10$RroJ5fjMGv5134ElTWocl.ZBo1exT121f5p0OjJTRLvZ8q3GMpnGu'),
      ('Egor Borodko', 'egorbor2004@gmail.com', '$2a$10$CC460LkOHtZG37hlLa6byux9Iq9CbPicuslJ7UjZAZlcD9PfNgEm6');

insert into tasks (title, description, status, expiration_date)
values('Buy cheese', null, 'TODO', '2023-01-29 12:00:00'),
      ('Do homework', 'Math etc', 'IN_PROGRESS', '2023-01-31 00:00:00'),
      ('Clean room', null, 'DONE', null),
      ('Call Egor', 'Ask about meeting', 'TODO', '2023-02-01 00:00:00');

insert into users_task(task_id, user_id)
values(1, 2),
      (2, 2),
      (3, 2),
      (4, 1);

insert into users_roles(user_id, role)
values(1, 'ADMIN_ROLE'),
      (1, 'ROLE_USER'),
      (2, 'ROLE_USER');
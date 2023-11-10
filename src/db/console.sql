create table audit_department (
                                  "Ревизионный номер" varchar not null primary key,
                                  "Тип изделия" varchar not null ,
                                  "Адрес расположения" varchar not null
);

insert into audit_department ("Ревизионный номер", "Тип изделия", "Адрес расположения")
values ('Xg_5124', 'Компьютер', 'Общага'),
       ('Ni_9935', 'Проектор', 'Оршанка'),
       ('Ab_5219', 'Эл.доска', 'ГУК');
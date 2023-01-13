insert into team("name")
values ('team_1'),
       ('team_2');
insert into player(name, number, id_team)
VALUES ('player_1', 0, 1),
       ('player_2', 2, 2);
insert into sponsor(name)
VALUES ('sponsor_1'),
       ('sponsor_2');

insert into play_against (datetime, stadium, id_home, id_opponent)
values (current_timestamp, 'barea', 1, 2);

insert into have_sponsor(id_team, id_sponsor)
VALUES (1, 1),
       (1, 2),
       (2, 1);
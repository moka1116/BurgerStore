INSERT INTO burger(name)
VALUES ('Hamburger'),
       ('Cheeseburger'),
       ('BLT burger');

INSERT INTO ingredient(name)
VALUES ('Patty'),
       ('Cheese'),
       ('Tomato'),
       ('Lettuce');

INSERT INTO burger_ingredient(burger_id, ingredient_id)
VALUES (1, 1),
       (2, 1),
       (2, 2),
       (3, 1),
       (3, 2),
       (3, 3),
       (3, 4);
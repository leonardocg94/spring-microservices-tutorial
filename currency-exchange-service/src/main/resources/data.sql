insert into CURRENCY_EXCHANGE(ID, IDENTIFIER) 
  values (1, 'MXN'),
    (2, 'USD'),
    (3, 'EUR'),
    (4, 'JPY');

insert into CURRENCY(ID, IDENTIFIER, CONVERTED, EXCHANGE_ID) 
  values  (1, 'USD', 0.5, 1),
          (2, 'EUR', 0.512, 1),
          (3, 'JPY', 7.3666, 1),
          (4, 'MXN', 19.9836, 2),
          (5, 'EUR', 1.0229, 2),
          (6, 'JPY', 147.23, 2),
          (7, 'MXN', 19.5335, 3),
          (8, 'USD', 0.9776, 3),
          (9, 'JPY', 143.93, 3),
          (10, 'MXN', 0.1357, 4),
          (11, 'USD', 0.0068, 4),
          (12, 'EUR', 0.0069, 4);
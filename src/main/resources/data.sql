INSERT INTO employee (employee_id, employee_name, age)
VALUES(1, 'mizuho', 100);

INSERT INTO m_user (user_id, password, user_name, birthday, age, marriage, role)
VALUES('mizuho@xxx.co.jp',
'$2a$10$xRTXvpMWly0oGiu65WZlm.3YL95LGVV2ASFjDhe6WF4.Qji1huIPa',
 'みずほFG', '1919-01-01', 100, false, 'ROLE_ADMIN');

INSERT INTO m_user (user_id, password, user_name, birthday, age, marriage, role)
VALUES('ukai@xxx.co.jp', '$2a$10$xRTXvpMWly0oGiu65WZlm.3YL95LGVV2ASFjDhe6WF4.Qji1huIPa',
 '鵜飼', '1990-01-01', 25, false, 'ROLE_GENERAL');
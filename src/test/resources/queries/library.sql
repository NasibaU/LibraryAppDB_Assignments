select count(id) from users; -- actual data

select count(distinct id) from users; -- expected data

select * from users; -- DB expected and Ui/required Actual

select * from book_borrow
where is_returned = 0 ;-- UI -->213  -- DB -->213





create  table 'tbl_cities' (
'city_id' int(11) Not Null Auto-increment,
'city_name' varchar(30) collate utf8-unicode-ci Not Null, 
'state_id' int(11) Not  Null  
'status' tinyint(1) Not Null  Default  '1'  
comment 'o:Blocked,1:Active',
primary  key('city_id')   
)Engine=innoDB  Auto-increment=6178
Default charset=utf8  
collate =utf8-unicode-ci                
#!/usr/bin/env bash

echo "
create database testvolo CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
grant all privileges on testvolo.* to 'testvolo'@'%' identified by 'testvolo';
flush privileges;
" | mysql -uroot -p

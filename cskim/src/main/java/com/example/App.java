package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

/* 
http://localhost:8080/api/members

db table 생성
 
create table members (
no int(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
companyno int(20) NOT NULL,
name varchar(30)  NOT NULL,
team varchar(30)  NOT NULL,
position varchar(30)  NOT NULL,
mrank varchar(30)  NOT NULL
)

db 삽입
insert into members(no,companyno,name,team,position,mrank) values (5411,4841,"jun","HP1","ass","B");

table 조회
select * from members;
*/
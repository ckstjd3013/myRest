package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "members")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	@Id
	@GeneratedValue
    private Integer no;
	private Integer companyno;
    private String name;
    private String team;
    private String position;
    private String mrank;
}

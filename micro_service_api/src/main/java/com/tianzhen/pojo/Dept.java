package com.tianzhen.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Table(name="dept")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable{
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptno;
    @Column(name="dname")
    private String dname;
    @Column(name = "db_source")
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }
}

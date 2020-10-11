package com.liwen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employees {
    private int employeeID;
    private String employeeName;
    private int employeeCounts;
    private String detail;
}
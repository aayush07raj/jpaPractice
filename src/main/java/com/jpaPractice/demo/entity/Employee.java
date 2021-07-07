package com.jpaPractice.demo.entity;


import com.jpaPractice.demo.service.StringSequenceIdentifier;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@IdClass(UserId.class)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="uuid",updatable = false,nullable = false)
    private UUID id;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "employeeIdGenerator")
    @GenericGenerator(
            name = "employeeIdGenerator",
            strategy = "com.jpaPractice.demo.service.StringSequenceIdentifier",
            parameters = {
                    @Parameter(name = StringSequenceIdentifier.INCREMENT_PARAM, value = "1"),
                    @Parameter(name = StringSequenceIdentifier.VALUE_PREFIX_PARAMETER, value = "TH-"),
                    @Parameter(name = StringSequenceIdentifier.NUMBER_FORMAT_PARAMETER, value = "%03d") })
    private String employeeId;

//    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "empSeq")
//    @GenericGenerator(
//            name = "empSeq",
//            strategy = "com.jpaPractice.demo.service.StringSequenceIdentifier",
//            parameters = {
//                    @org.hibernate.annotations.Parameter(name = StringSequenceIdentifier.INCREMENT_PARAM, value = "1"),
//                    @org.hibernate.annotations.Parameter(name = StringSequenceIdentifier.VALUE_PREFIX_PARAMETER, value = "EMP_"),
//                    @org.hibernate.annotations.Parameter(name = StringSequenceIdentifier.NUMBER_FORMAT_PARAMETER, value = "%02d") })
//    @Column(name="employee_id")
//    private long employeeId;
//
    @Column(name="roll")
    private long roll;

}

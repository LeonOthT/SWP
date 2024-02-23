package com.swp.birthdaybooking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "Feedback")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    @Id
    @Column(name = "feedback_id")
    private int feedbackId;

    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "service_id")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "guest_id", referencedColumnName = "guest_id")
    private Guest guest;

    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "feedback_date")
    private Date feedbackDate;
}

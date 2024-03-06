package com.swp.birthdaybooking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "schedule_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDetail {

    @Id
    @Column(name = "schedule_Detail_id")
    private int scheduleDetailId;

    @ManyToOne
    @JoinColumn(name = "schedule_id", referencedColumnName = "Schedule_id")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "host_id", referencedColumnName = "host_id")
    private Host host;
}

package kz.pomo.but_travel.model.entity;


import kz.pomo.but_travel.model.audit.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Travel extends AuditModel {

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "start_station_id")
    private Station startStation;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "goal_station_id")
    private Station goalStation;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ticket> tickets;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Bus bus;

}

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
public class City extends AuditModel {

    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Country country;

    @JoinColumn(name = "city_id")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Station> stations;

}

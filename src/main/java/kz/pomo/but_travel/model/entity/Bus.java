package kz.pomo.but_travel.model.entity;

import kz.pomo.but_travel.model.audit.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Bus extends AuditModel {

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Company company;

}

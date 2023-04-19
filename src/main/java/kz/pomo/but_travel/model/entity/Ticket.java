package kz.pomo.but_travel.model.entity;


import kz.pomo.but_travel.model.audit.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Ticket extends AuditModel {

    @Column(name = "transport_dispatch_time")
    private Date transportDispatchTime;

    @Column(name = "qr_identifier")
    private String qrIdentifier;

    @Column(name = "expired")
    private Boolean expired;

}

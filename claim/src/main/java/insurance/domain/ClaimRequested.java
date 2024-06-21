package insurance.domain;

import insurance.domain.*;
import insurance.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ClaimRequested extends AbstractEvent {

    private Long id;

    public ClaimRequested(Receipt aggregate) {
        super(aggregate);
    }

    public ClaimRequested() {
        super();
    }
}
//>>> DDD / Domain Event

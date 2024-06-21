package insurance.domain;

import insurance.domain.*;
import insurance.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Reviewed extends AbstractEvent {

    private Long id;

    public Reviewed() {
        super();
    }
}
//>>> DDD / Domain Event

package insurance.domain;

import insurance.domain.*;
import insurance.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Reviewed extends AbstractEvent {

    private Long id;
}

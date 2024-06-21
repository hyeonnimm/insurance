package insurance.infra;

import insurance.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReceiptHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Receipt>> {

    @Override
    public EntityModel<Receipt> process(EntityModel<Receipt> model) {
        return model;
    }
}

package insurance.infra;

import insurance.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/receipts")
@Transactional
public class ReceiptController {

    @Autowired
    ReceiptRepository receiptRepository;

    @RequestMapping(
        value = "receipts/{id}/requestclaim",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Receipt requestClaim(
        @PathVariable(value = "id") Long id,
        @RequestBody RequestClaimCommand requestClaimCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /receipt/requestClaim  called #####");
        Optional<Receipt> optionalReceipt = receiptRepository.findById(id);

        optionalReceipt.orElseThrow(() -> new Exception("No Entity Found"));
        Receipt receipt = optionalReceipt.get();
        receipt.requestClaim(requestClaimCommand);

        receiptRepository.save(receipt);
        return receipt;
    }
}
//>>> Clean Arch / Inbound Adaptor

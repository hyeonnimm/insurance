package insurance.domain;

import insurance.ClaimApplication;
import insurance.domain.ClaimRequested;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Receipt_table")
@Data
//<<< DDD / Aggregate Root
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private String diseaseCode;

    private String userName;

    private Date dt;

    @PostPersist
    public void onPostPersist() {
        ClaimRequested claimRequested = new ClaimRequested(this);
        claimRequested.publishAfterCommit();
    }

    public static ReceiptRepository repository() {
        ReceiptRepository receiptRepository = ClaimApplication.applicationContext.getBean(
            ReceiptRepository.class
        );
        return receiptRepository;
    }
}
//>>> DDD / Aggregate Root

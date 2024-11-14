package ma.formations.graphql.dtos.bankaccount;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AddBankAccountRequest {
    private String rib;
    private Double amount;
    private String customerIdentityRef;
    import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formations.graphql.dtos.customer.CustomerDto;
import ma.formations.graphql.enums.AccountStatus;

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Data
    public class AddBankAccountResponse {
        private String message;
        private Long id;
        private String rib;
        private Double amount;
        private String createdAt;
        private AccountStatus accountStatus;
        private CustomerDto customer;
    }
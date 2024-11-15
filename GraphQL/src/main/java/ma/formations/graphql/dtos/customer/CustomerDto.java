package ma.formations.graphql.dtos.customer;
import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CustomerDto {
    private Long id;
    private String username;
    private String identityRef;
    private String firstname;
    private String lastname;
}
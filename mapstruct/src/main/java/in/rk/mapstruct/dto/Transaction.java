package in.rk.mapstruct.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Transaction {

	private String uuid;//same name & type
	private Long totalInCents;
}

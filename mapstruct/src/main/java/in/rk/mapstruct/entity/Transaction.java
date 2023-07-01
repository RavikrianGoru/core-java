package in.rk.mapstruct.entity;

import java.math.BigInteger;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
public class Transaction {

	private Long id;
	private String uuid = UUID.randomUUID().toString();
	private BigInteger total;

}

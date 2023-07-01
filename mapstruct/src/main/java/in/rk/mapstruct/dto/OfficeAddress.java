package in.rk.mapstruct.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class OfficeAddress {
	private String houseNo;
	private String city;
	private String state;
	private String pinCode;
}

package in.rk.mapstruct.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
public class EmpAddress {
	
	private String houseNo1;
	private String city1;
	private String state1;
	private String pinCode1;
	
	private String houseNo2;
	private String city2;
	private String state2;
	private String pinCode2;

}

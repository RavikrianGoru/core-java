package in.nareshit.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@ToString
public class Student {

	private  Integer sid;
	private String sname;
	private Double savg;
}

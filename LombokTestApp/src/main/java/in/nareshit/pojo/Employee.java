package in.nareshit.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
//@RequiredArgsConstructor
public class Employee {

	@NonNull
	private Integer eid;
	@NonNull
	private String ename;
	private Double esal;
}

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
//@Value
public class Employee {

	@NonNull
	private Integer eid;
	@NonNull
	private String ename;
	private Double esal;
	//@With(AccessLevel.PACKAGE) @NonFinal int age;
}

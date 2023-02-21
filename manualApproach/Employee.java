import lombok.*;

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
//@Data		//@Setter,@Getter,@ToString,@EqualsAndHashCode

//@NoArgsConstructor
//@AllArgsConstructor

//@RequiredArgsConstructor
public class Employee
{
	//@NonNull Not applicable on primitive as int will not hold null.
	private int eid;
	//@NonNull
	private String ename;
	private Double esal;
}
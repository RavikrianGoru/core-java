import lombok.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.With;
import lombok.experimental.NonFinal;

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
//@Data		//@Setter,@Getter,@ToString,@EqualsAndHashCode

//@NoArgsConstructor
//@AllArgsConstructor

//@RequiredArgsConstructor

@Value
public class Employee
{
	int eid;
	String ename;
	private Double esal;
	@With(AccessLevel.PACKAGE) @NonFinal int eage;
	
}
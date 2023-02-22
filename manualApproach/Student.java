import lombok.Builder;
import lombok.ToString;
import java.util.List;
import lombok.Singular;


@Builder
@ToString
public class Student {

	@Builder.Default private long created = System.currentTimeMillis();

	private  Integer sid;
	private String sname;
	private Double savg;

	@Singular private List<String> qualifs;

}


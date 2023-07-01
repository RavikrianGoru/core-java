package in.rk.mapstruct.dto;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Project {

	private String name;
	private LocalDate startDate;
	private Double budget;
	private int size;
}

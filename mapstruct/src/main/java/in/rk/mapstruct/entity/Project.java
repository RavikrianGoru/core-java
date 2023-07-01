package in.rk.mapstruct.entity;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
public class Project {

	private String name;
	private LocalDate startDate;
	private Double budget;
	private int size;
}

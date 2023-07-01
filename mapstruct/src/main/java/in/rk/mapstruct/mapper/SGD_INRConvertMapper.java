package in.rk.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "java")
public interface SGD_INRConvertMapper {
	
	//1 QualifiedByName
	@Named("inrToSgd")
	public static double inrToSgd(double inr)
	{
		return inr / 61.79;
	}
	@Named("sgdToInr")
	public static double sgdToInr(double sgd)
	{
		return sgd * 61.79;
	}
	
	
	//2
	@InrToSgdConverter
	public static double convertInrToSgd(double inr)
	{
		return inr / 61.79;
	}
	@SgdToInrConverter
	public static double convertSgdToInr(double sgd)
	{
		return sgd * 61.79;
	}
	
}

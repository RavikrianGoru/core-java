package in.nareshit.annotations;

public class ProductProcess {

	public static void process(Class<?> c)
	{
		Product p =c.getAnnotation(Product.class);
		if(p==null)
		{
			//throw new RuntimeException("No Product annotation is provided");
		}else
		{
			System.out.println(c.getName() + " is having product Annotation");
			System.out.println(p.prodId()+"----"+p.objName()+"----"+p.objType());
		}
	}
}

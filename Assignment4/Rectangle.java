/*

                       UML class Diagram
					   Rectangle
					   width: double
					   height: double
					   errorMessage: double
					  Rectangle() 
				Rectangle( _width :double, _height: double)
					  getWidth() 
					  getHeight() 
					  getErrorMessage()
					 setWidth(_width : double)
					 setHeight(_height : double )
					 print() 
					 toString() 
					 equals(o : Object)	
					  isValidWidth(_width : double)
					  isValidHeight(_height : double)
					  getArea()
					  getPerimeter()
				
 */



public class Rectangle 
{

	private double width = 1.0;
	private double height = 1.0;
	private String errorMessage = "";
	
	public Rectangle() {

	}										
	public Rectangle(double _width, double _height) throws Exception
	{
		setWidth(_width);
		setHeight(_height);
	} 


	public double getWidth() { 
		return width; 
	}
	public double getHeight() { 
		return height; 
	}
	public String getErrorMessage() { 
		return errorMessage; 
	}

	public void setWidth(double _width) throws Exception
	{
		if(!isValidWidth(_width))
			throw new Exception(errorMessage);
		width = _width;
	}
	public void setHeight(double _height) throws Exception
	{
		if(!isValidHeight(_height))
			throw new Exception(errorMessage);
		height = _height;
	}
	

	public void print() 
	{
		System.out.println("Rectangle:");
		System.out.println("----------------------------------------------------");
		System.out.println("Width : " + width);
		System.out.println("Heigh : " + height);
		System.out.println("Area : " + getArea());
		System.out.println("Perimeter : " + getPerimeter());
	}
	@Override
	public String toString() 
	{
		return "Width :" + width + ", Height :" + height;
	}
	@Override
	public boolean equals(Object o)
	{

		if( o == null) return false;
		

		String s = o.getClass().getName(); 
		if( !s.equals("Rectangle")) return false;
		

		Rectangle b = (Rectangle) o;
	
		if(	width != b.getWidth()) return false;
		if( height != b.getHeight()) return false;
		
		return true;
	}
	

	public boolean isValidWidth(double _width)
	{
		if(_width > 0) 
			return true;
		else
		{
			errorMessage = "Width should be greater than 0";
			return false;
		}
			
	}
	public boolean isValidHeight(double _height)
	{
		if(_height > 0) 
			return true;
		else
		{
			errorMessage = "Height should must be greater than 0";
			return false;
		}
	}
	

	public double getArea()
	{
		return width*height;
	}
	public double getPerimeter()
	{
		return (2*width)+(2*height);
	}
	
}

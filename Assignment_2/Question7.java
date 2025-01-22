class Question7{
	public static void main(String args[]){
		int rk=6378;
		double rm=(double)rk*1.6;
		double vik=(double)(4*3.1415*rk*rk*rk)/3;
		double vim=(double)(4*3.1415*rm*rm*rm)/3;
		System.out.println("The volume of earth in cubic kilometers is "+vik" and cubic miles is "+vim);
	}
}
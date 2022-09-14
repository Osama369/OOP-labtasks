public class Task3{


	public static void main(String[] args) {
		double total=0;
		double averge=0;
		if (args.length>0) {
        
		for (int i=0; i<args.length;i++) {
				total+=Double.parseDouble(args[i]);
				averge= total/5;
			}	
            System.out.println("sum:"+total);
            System.out.println("averge:"+averge);

		}
		
	}
}
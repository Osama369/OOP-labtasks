import java.util.Scanner;

public class Task1{

	public static void main(String[] args) {
     String[] color={"Blue","yellow","Orange","Red"};// array 
   for(int i=0; i<color.length; i++){
      if(color[i].equals(args[0])){
      System.out.println("position is:"+i);
      break;
    }
    else if(i==3){
     System.out.println("position not found..");
    }
}
}
}
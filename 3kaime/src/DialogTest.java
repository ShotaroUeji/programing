public class DialogTest { 
 public static void main(String[] args) { 
 String text = javax.swing.JOptionPane.showInputDialog(null); 
 
 if(text.equals("1")) {
	 System.out.println("freshman");
 }else if(text.equals("2")) {
	 System.out.println("sophomore");
 }else if(text.equals("3")) {
	 System.out.println("junior");
 }else if(text.equals("4")) {
	 System.out.println("senior");
 }else {System.out.println("unknown");
}
}
}
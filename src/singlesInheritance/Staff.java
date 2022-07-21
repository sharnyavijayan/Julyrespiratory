package singlesInheritance;
//childclass
public class Staff extends Student {
public void staffId() {
	System.out.println("Staff Id is 4389");
}
public static void main(String[] args) {
	Staff st= new Staff ();
	st.staffId();
	st.studentId();
}
}
